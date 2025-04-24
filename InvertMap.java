import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InvertMap {
    
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map1) {
        Map<V, List<K>> map = new HashMap<>();

        for (Map.Entry<K, V> entry : map1.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            if (!map.containsKey(value)) {
                List<K> list = new ArrayList<>();
                list.add(key);
                map.put(value, list);
            } else {
                map.get(value).add(key);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> output = invertMap(map);
        System.out.println(output);
    }
}

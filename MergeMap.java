import java.util.HashMap;
import java.util.Map;

public class MergeMap {
    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> merged = merge(map1, map2);
        System.out.println(merged);
    }
}
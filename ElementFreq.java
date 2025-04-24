import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFreq {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("orange");
        Map<String,Integer> freq=new HashMap<>();
        for(String i: list){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq.toString());
        
    }
}

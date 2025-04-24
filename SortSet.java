import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(9);
        set1.add(8);
        set1.add(7);
        set1.add(6);
        set1.add(5);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);
        int[] arr = new int[set1.size()];
        int index = 0;
        for (Integer num : set1) {
            arr[index++] = num;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

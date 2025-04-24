import java.util.HashSet;
import java.util.Set;

public class SymmetricDiff {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3);
		Set<Integer> set2 = Set.of(3,4,5);
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);
        result.removeAll(set2);
        temp.removeAll(set1);
        result.addAll(temp);
        System.out.println(result.toString());
    }
}

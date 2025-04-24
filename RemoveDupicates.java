import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupicates {
    public static void main(String[] args) {
        Set<Integer> remove=new LinkedHashSet<>();
        remove.add(3);
        remove.add(1);
        remove.add(2);
        remove.add(2);
        remove.add(3);
        remove.add(4);
        remove.add(5);
        remove.add(3);
        remove.add(2);
        remove.add(1);
        System.out.println(remove.toString());
    }
}

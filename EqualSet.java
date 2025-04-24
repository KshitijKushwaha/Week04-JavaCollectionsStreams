import java.util.Set;
import java.util.HashSet;

public class EqualSet {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        set1.add(12);
        set1.add(12);
        set1.add(15);
        set1.add(62);
        set1.add(82);
        set1.add(132);
        set1.add(18);
        set1.add(11);
        set1.add(19);
        set2.add(12);
        set2.add(12);
        set2.add(15);
        set2.add(62);
        set2.add(825);
        set2.add(132);
        set2.add(18);
        set2.add(11);
        set2.add(19);
        if(set1.equals(set2)){
            System.out.println("True");
        }        
        else
        System.out.println("False");
                
    }
}

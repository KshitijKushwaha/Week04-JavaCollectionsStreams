import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int n=list.size();
        int j=n-1;
        for(int i=0;i<n/2;i++){
            int temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            j--;        
        }
        System.out.println(list.toString());
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        int m=ll.size();
        int k=m-1;
        for(int i=0;i<m/2;i++){
            int temp=ll.get(i);
            ll.set(i, ll.get(k));
            ll.set(k, temp);
            k--;        
        }
        System.out.println(ll.toString());
    }
}

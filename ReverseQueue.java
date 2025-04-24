import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(20);
        q.add(10);
        q.add(40);
        q.add(30);     
        List<Integer> temp = new LinkedList<>(q);
        Collections.reverse(temp);
        System.out.println(temp.toString());
    }
}

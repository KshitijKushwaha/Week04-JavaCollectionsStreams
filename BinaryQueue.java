import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryQueue {
    public static List<String> binaryNumbers(int N) {
        Queue<String> q = new LinkedList<>();
        List<String> bn = new ArrayList<>();
        q.add("1");
        for (int i = 0; i < N; i++) {
            String current = q.poll();
            bn.add(current);
            q.add(current + "0");
            q.add(current + "1");
        }
        return bn;
    }

    public static void main(String[] args) {
        int n = 50;
        List<String> binaryNumbers = binaryNumbers(n);
        System.out.println("First " + n + " binary numbers: " + binaryNumbers);
    }
}


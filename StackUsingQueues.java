import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int pop = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return pop;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2354);
        stack.push(3345);
        
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
    }
}

import java.util.LinkedList;

public class CircularBuffer {
    LinkedList<Integer> buffer;
    int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public void insert(int value) {
        if (buffer.size() == capacity) {
            buffer.poll();
        }
        buffer.offer(value);
    }

    public int remove() {
        if (buffer.isEmpty()) {
            System.out.println("Buffer is empty!");
            return -1;
        }
        return buffer.poll();
    }

    public void display() {
        if (buffer.isEmpty()) {
            System.out.println("Buffer is empty!");
            return;
        }
        System.out.print("Buffer: ");
        for (int value : buffer) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return buffer.size() == capacity;
    }

    public boolean isEmpty() {
        return buffer.isEmpty();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(4);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();
        cb.insert(4);
        cb.display();
        System.out.println("Removed: " + cb.remove());
        cb.display();
        cb.insert(5);
        cb.display();
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;
    private int maxSize;

    public PriorityQueue(int capacity) {
        this.maxSize = capacity;
        this.items = new int[maxSize];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == items.length);
    }

    public void enqueue(int data) {
        if (isFull())
            throw new IllegalStateException("Queue is Full");

        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > data) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        items[i + 1] = data;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty");

        return items[--count];
    }

    public void printQueue() {
        while (!isEmpty()) {
            System.out.print(dequeue() + " ");
        }
        System.out.println();
    }

    public String toString() {
        return Arrays.toString(items);
    }
}

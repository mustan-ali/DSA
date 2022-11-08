public class QueueDSArray {
    private int[] items;
    private int maxSize;
    private int count;
    private int front;
    private int rear;

    public QueueDSArray(int capacity) {
        this.maxSize = capacity;
        this.items = new int[maxSize];
        this.count = 0;
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            front++;
        } else if (count == items.length) {
            throw new IllegalStateException("Queue is Full");
        }
        rear++;
        count++;
        items[rear] = data;

    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        int data = items[front];
        front++;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return items[front];
    }

    public boolean isComplete() {
        return (front == maxSize);
    }

    public void printQueue() {
        while (!isComplete()) {
            System.out.print(dequeue() + " ");
        }
    }

    public void max() {
        int max = peek();
        while (!isComplete()) {
            if (max < peek()) {
                max = peek();
            }
            dequeue();
        }
        System.out.print("Max: " + max);
    }

    public void min() {
        int min = peek();
        while (!isComplete()) {
            if (min > peek()) {
                min = peek();
            }
            dequeue();
        }
        System.out.print("Min: " + min);
    }

    public void product() {
        int product = 1;
        while (!isComplete()) {
            product *= dequeue();
        }
        System.out.print("Product: " + product);
    }

    public void average() {
        int sum = 0;
        while (!isComplete()) {
            sum += dequeue();
        }
        System.out.print("Average: " + sum / count);
    }

    public void find(int data) {
        int index = 0;
        boolean foundStatus = false;
        while (!isComplete()) {
            if (data == peek()) {
                foundStatus = true;
                break;
            }
            dequeue();
            index++;
        }
        if (foundStatus) {
            System.out.print("Found at: " + index);
        } else {
            System.out.print("Not Found");
        }
    }

    public void even() {
        while (!isComplete()) {
            if (peek() % 2 == 0) {
                System.out.print(dequeue() + " ");
            } else {
                dequeue();
            }
        }
    }

    public void odd() {
        while (!isComplete()) {
            if (peek() % 2 != 0) {
                System.out.print(dequeue() + " ");
            } else {
                dequeue();
            }
        }
    }

}
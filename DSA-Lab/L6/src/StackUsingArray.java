public class StackUsingArray {
    public int maxSize;
    private int[] stackArray;
    private int top;

    public StackUsingArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public void push(int item) {
        if (isFull()) {
            System.out.print("Stack is Full");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is Empty");
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    public int peek() {
        return stackArray[top];
    }

    public void max() {
        int max = peek();
        while (!isEmpty()) {
            if (max < peek()) {
                max = pop();
            } else {
                pop();
            }
        }
        System.out.print("Max: " + max);
    }

    public void min() {
        int min = peek();
        while (!isEmpty()) {
            if (min > peek()) {
                min = pop();
            } else {
                pop();
            }
        }
        System.out.print("Min: " + min);
    }

    public void average() {
        int sum = 0, length = 0;
        while (!isEmpty()) {
            sum += pop();
            length++;
        }
        System.out.print("Average: " + sum / length);
    }

    public void product() {
        int product = 1;
        while (!isEmpty()) {
            product *= pop();
        }
        System.out.print("Product: " + product);
    }
}

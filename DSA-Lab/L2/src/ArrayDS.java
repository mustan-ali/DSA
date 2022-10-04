public class ArrayDS {
    private int[] items;
    private int count;
    private int maxVal = -999999999;
    private int minVal = 999999999;
    private int product = 1;
    private float sum;

    public ArrayDS(int length) {
        this.items = new int[length];
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println("");
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index not valid!");
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
            count--;
        }
    }

    public void indexOf(int x) {
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == x) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Index of " + x + " is " + index);
        } else {
            System.out.println("Value not found!");
        }
    }

    public void maxValue() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] >= maxVal) {
                maxVal = items[i];
            }
        }
        System.out.println("Max Value: " + maxVal);
    }

    public void minValue() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] <= minVal) {
                minVal = items[i];
            }
        }
        System.out.println("Min Value: " + minVal);
    }

    public void productVal() {
        for (int i = 0; i < items.length; i++) {
            product = product * items[i];
        }
        System.out.println("Product: " + product);
    }

    public void averageVal() {
        for (int i = 0; i < items.length; i++) {
            sum = sum + items[i];
        }
        float average = sum / items.length;
        System.out.println("Average: " + average);
    }

    public void reversePrint() {
        for (int i = items.length - 1; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }
        System.out.println("");
    }

    public void printOdd() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 1) {
                System.out.print(items[i] + " ");
            }
        }
        System.out.println();
    }

    public void printEven() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                System.out.print(items[i] + " ");
            }
        }
        System.out.println();
    }

    public void replaceValue(int index, int value) {
        if (index > items.length || index < 0) {
            System.out.println("Error");
        } else {
            items[index] = value;
        }
    }

    public void swapVal(int a, int b) {
        int temp;
        if (a > items.length || a < 0 || b > items.length || b < 0) {
            System.out.println("Error");
        } else {
            temp = items[a];
            items[a] = items[b];
            items[b] = temp;
        }
    }
}


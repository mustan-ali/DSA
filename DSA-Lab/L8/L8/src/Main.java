public class Main {
    public static void main(String[] args) {

        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);
//        qll.printQueue();
        qll.dequeue();
        qll.dequeue();
        qll.printQueue();

        System.out.println();
        PriorityQueue pq = new PriorityQueue(5);
        pq.enqueue(5);
        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(7);
        pq.enqueue(2);
        pq.printQueue();
//        System.out.print(pq);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(arr, 5));
        System.out.println(binarySearch(arr, 5));

    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] a, int x) {
        int p = 0;
        int q;
        int r = a.length - 1;
        while (p <= r) {
            q = (p + r) / 2;
            if (a[q] == x) {
                return q;
            } else if (a[q] > x) {
                r = q - 1;
            } else {
                p = q + 1;
            }
        }
        return -1;
    }
}

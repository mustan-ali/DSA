public class Main {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFirst(1);
        cll.insertFirst(2);
        cll.insertFirst(3);
        cll.insertFirst(4);
        cll.insertFirst(5);

        cll.insertLast(10);
        cll.displayList();

        cll.removeFirst();
        cll.displayList();

        cll.even();
        cll.odd();
        cll.max();
        cll.min();
    }
}
public class Main {
    public static void main(String[] args) {


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertFirst(2);
        singlyLinkedList.insertFirst(3);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(-4);
        singlyLinkedList.displayList();

        singlyLinkedList.listLength();

        singlyLinkedList.deleteFirst();
        singlyLinkedList.displayList();

        singlyLinkedList.insertLast(5);
        singlyLinkedList.displayList();

        singlyLinkedList.deleteLast();
        singlyLinkedList.displayList();

        singlyLinkedList.product();
        singlyLinkedList.average();
        singlyLinkedList.countNegative();
        singlyLinkedList.even();
        System.out.println("");
        singlyLinkedList.odd();
        System.out.println("");
        singlyLinkedList.find(3);

        singlyLinkedList.displayList();
        singlyLinkedList.max();
        singlyLinkedList.min();


    }
}
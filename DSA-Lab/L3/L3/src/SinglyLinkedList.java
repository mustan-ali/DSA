import java.util.Scanner;

public class SinglyLinkedList {
    private Node first;
    Scanner input = new Scanner(System.in);

    public SinglyLinkedList() {
        this.first = null;
    }

    public void insertFirst(int data) { //O(1)
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void displayList() { //O(n)
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void listLength() {  //O(n)
        int length = 0;
        Node current = first;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        System.out.println("List Length: " + length);
    }

    public Node deleteFirst() { //O(n)
        Node temp = first;
        if (first != null) {
            first = first.next;
        }
        return temp;
    }

    public void insertLast(int data) { //O(1)
        Node newNode = new Node();
        newNode.data = data;
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteLast() { //O(n)
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void product() { //O(n)
        int product = 1;
        Node current = first;
        while (current != null) {
            product = product * current.data;
            current = current.next;
        }
        System.out.println("Product: " + product);
    }

    public void average() { //O(n)
        int sum = 0;
        int average = 0;
        int length = 0;
        Node current = first;
        while (current != null) {
            sum = sum + current.data;
            current = current.next;
            length++;
        }
        average = sum / length;
        System.out.println("Average: " + average);
    }

    public void countNegative() { //O(n)
        int negative = 0;
        Node current = first;
        while (current != null) {
            if (current.data < 0) {
                negative++;
            }
            current = current.next;
        }
        System.out.println("Negative: " + negative);
    }

    public void even() { //O(n)
        Node current = first;
        while (current != null) {
            if (current.data % 2 == 0) {
                System.out.print("(" + current.data + ")-->");
            }
            current = current.next;
        }

    }

    public void odd() { //O(n)
        Node current = first;
        while (current != null) {
            if (current.data % 2 == 1) {
                System.out.print("(" + current.data + ")-->");
            }
            current = current.next;
        }
    }

    public void find(int x) { //O(n)
        boolean found = false;
        Node current = first;
        while (current != null) {
            if (current.data == x) {
                found = true;
            }
            current = current.next;
        }
        if (found) {
            System.out.println("Data Found");
        } else {
            System.out.println("Data Not Found");
        }
    }

    public void max() { //O(n)
        Node current = first;
        int max = -999999999;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("Max Value: " + max);
    }

    public void min() { //O(n)
        Node current = first;
        int min = 999999999;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        System.out.println("Min Value: " + min);
    }
}


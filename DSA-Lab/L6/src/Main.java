public class Main {
    public static void main(String[] args) {

        //Stack-->LIFO

        //Stack Using Array
        StackUsingArray sa = new StackUsingArray(5);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        sa.push(5);

                while (!sa.isEmpty()) {
            System.out.print(sa.pop() + " ");
        }

//        sa.max();
//        sa.min();
//        sa.average();
//        sa.product();



        //Stack Using Linked List
        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);

        sll.printStack();
    }
}
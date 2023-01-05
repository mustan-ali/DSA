import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Tree t = new Tree();
        t.insert(7);
        t.insert(4);
        t.insert(9);
        t.insert(1);
        t.insert(6);
        t.insert(8);
        t.insert(10);
//        System.out.println("Done");

        System.out.println("preorderTraversal");
        t.preorderTraversal();

        System.out.println("\ninorderTraversal");
        t.inorderTraversal();

        System.out.println("\ninorderTraversal Dec");
        t.inorderTraversalDesc();

        System.out.println("\npostorderTraversal");
        t.postorderTraversal();

        System.out.println("\nHeight : "+t.height());

        System.out.println("Min :" + t.minNode());

        System.out.println("Max : " + t.maxNode());

        System.out.println("is BST: " + t.isBinarySearchTree());

        System.out.println("---------------------------------");

        AVL_Tree at=new AVL_Tree();
        at.insert(10);
        at.insert(20);
        at.insert(30);

    }
}
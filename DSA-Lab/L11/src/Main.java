import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        int[] arr1 = {3, 5, 1, 4, 2};
        ms.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3, 5, 1, 4, 2};
        QuickSort qs = new QuickSort();
        qs.sort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        Tree t = new Tree();
        t.insert(1);
        t.insert(3);
        t.insert(2);
        t.insert(4);
        t.insert(5);
    }
}
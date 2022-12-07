import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {3, 2, 1, 5, 4, 6};

        int[] result1 = selectionSort(a);
        System.out.println(Arrays.toString(result1));

        recursiveSelectionSort(a, 1, 1);

        int[] result2 = insertionSort(a);
        System.out.println(Arrays.toString(result2));

        int[] result3 = bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] selectionSort(int[] arr) {
        int minimum;
        for (int i = 0; i < arr.length - 1; i++) {
            minimum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
        return arr;
    }

    public static void recursiveSelectionSort(int[] arr, int i, int j) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
        } else if (j == arr.length) {
            recursiveSelectionSort(arr, i + 1, i + 2);
        } else {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            recursiveSelectionSort(arr, i, j + 1);
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                return arr;
        }
        return arr;
    }
}
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        reduceByOne(5);
        System.out.println(sum(5));
        System.out.println(recursiveLinearSearch(arr, 0, 4));
        System.out.println(recursiveBinarySearch(arr, 0, arr.length - 1, 4));
        System.out.println(recursiveTernarySearch(arr,4,0,arr.length-1));
        System.out.println(recursiveJumpSearch(arr,4));
    }

    //Recursive Algorithm
    public static void reduceByOne(int n) {
        if (n >= 0)
            reduceByOne(n - 1);
        System.out.print(n + " ");
    }

    public static int sum(int k) {
        if (k >= 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int recursiveLinearSearch(int[] array, int index, int value) {
        int arrayLength = array.length - 1;

        if (index > arrayLength)
            return -1;
        else if (array[index] == value)
            return index;
        else
            return recursiveLinearSearch(array, index + 1, value);
    }

    public static int recursiveBinarySearch(int[] array, int p, int r, int value) {
        System.out.println("[ " + p + "... ... " + r + " ]");
        int q;
        if (p > r) {
            return -1;
        } else {
            q = (p + r) / 2;
            if (array[q] == value) {
                return q;
            } else if (array[q] > value) {
                return recursiveBinarySearch(array, p, q - 1, value);
            } else {
                return recursiveBinarySearch(array, q + 1, r, value);
            }
        }
    }

    public static int recursiveTernarySearch(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;

        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return recursiveTernarySearch(array, target, left, right = mid1 - 1);


        if (target > array[mid2])
            return recursiveTernarySearch(array, target, left = mid2 + 1, right);

        return recursiveTernarySearch(array, target, left = mid1 + 1, right = mid2 - 1);

    }

    public static int recursiveJumpSearch(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next - 1] < target) {
            start = next;
            next += blockSize;

            if (next > array.length) {
                next = array.length;
            }
        }
        for (int i = start; i < next; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}


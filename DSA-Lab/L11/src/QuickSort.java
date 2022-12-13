public class QuickSort {
    public void sort(int[] array, int start, int end) {
        if (start >= end)
            return;

        int boundary = partition(array, start, end);
        sort(array, start, boundary - 1);   //Left
        sort(array, boundary + 1, end);     //Right
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;

        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        }
        return boundary;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

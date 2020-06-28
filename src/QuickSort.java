public class QuickSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int lo, int hi) {
        if(lo < hi) {
            int pivot = partition(arr, lo, hi);

            sort(arr, lo, pivot - 1);
            sort(arr, pivot + 1, hi);
        }
    }

    private int partition(int[] arr, int lo, int hi) {

        int pivot = arr[hi];

        int pointer = lo;

        for (int i = lo; i <= hi; i++) {
            if (arr[i] < pivot) {
                swap(arr, pointer, i);
                pointer++;
            }
        }

        swap(arr, pointer, hi);

        return pointer;
    }

    public static void main(String[] args) {
        SortAlgorithm qs = new QuickSort();
        int[] test = new int[]{4, 2, 2, 8, 3, 3, 1, 9, 7};
        qs.sort(test);
        qs.printArray(test);
    }
}

public class MergeSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            sort(arr, lo, mid);
            sort(arr, mid + 1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    private void merge(int[] arr, int lo, int mid, int hi) {

        int[] temp = new int[hi - lo + 1];

        int i = lo, j = mid + 1, k = 0;

        while(i <= mid && j <= hi) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= hi) {
            temp[k++] = arr[j++];
        }

        for (int n = lo; n <= hi; n++) {
            arr[n] = temp[n - lo];
        }
    }

    public static void main(String[] args) {
        SortAlgorithm ms = new MergeSort();
        int[] test = new int[]{4, 2, 2, 8, 3, 3, 1, 9, 7};
        ms.sort(test);
        ms.printArray(test);
    }


}

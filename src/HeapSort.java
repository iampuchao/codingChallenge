/**
 * https://www.programiz.com/dsa/heap-sort
 */
public class HeapSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i =  n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right =  2 * root + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            swap(arr, largest, root);
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        SortAlgorithm hs = new HeapSort();
        int[] test = new int[]{4, 2, 2, 8, 3, 3, 1, 9, 7};
        hs.sort(test);
        hs.printArray(test);
    }
}

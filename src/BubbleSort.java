public class BubbleSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        SortAlgorithm bs = new BubbleSort();
        int[] test = new int[]{20, 10, 60, 50, 40};
        bs.sort(test);
        bs.printArray(test);
    }
}

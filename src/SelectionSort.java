public class SelectionSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }




    public static void main(String[] args) {
        SortAlgorithm ss = new SelectionSort();
        int[] test = new int[]{20, 10, 60, 50, 40};
        ss.sort(test);
        ss.printArray(test);
    }
}

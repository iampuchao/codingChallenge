public class InsertionSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int pointer = i - 1;

            while(pointer > 0 && arr[pointer] > curr) {
                arr[pointer + 1] = arr[pointer];
                pointer--;
            }

            arr[pointer + 1] = curr;
        }
    }

    public static void main(String[] args) {
        SortAlgorithm is = new InsertionSort();
        int[] test = new int[]{20, 10, 60, 50, 40};
        is.sort(test);
        is.printArray(test);
    }
}

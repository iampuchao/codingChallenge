public abstract class SortAlgorithm {

    void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + ", ");
        }
    }

    public abstract void sort(int[] arr);

}

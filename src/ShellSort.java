public class ShellSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i  = interval; i < n; i++) {
                int temp = arr[i];

                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval) {
                    arr[j] = arr[j - interval];
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SortAlgorithm ss = new ShellSort();
        int[] test = new int[]{20, 10, 60, 50, 40};
        ss.sort(test);
        ss.printArray(test);
    }
}

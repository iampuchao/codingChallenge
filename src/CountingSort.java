public class CountingSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int num : arr) {
            int pos = count[num] - 1;
            output[pos] = num;
            count[num]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        SortAlgorithm cs = new CountingSort();
        int[] test = new int[]{4, 2, 2, 8, 3, 3, 1};
        cs.sort(test);
        cs.printArray(test);
    }
}

/**
 * https://www.geeksforgeeks.org/radix-sort/
 */

public class RadixSort extends SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    private void countSort(int[] arr, int place) {
        int n = arr.length;

        int[] out = new int[n];
        int[] count = new int[10];

        for (int num: arr) {
            count[(num / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = count[(arr[i] / place) % 10];
            out[index - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = out[i];
        }
    }

    public static void main(String[] args) {
        SortAlgorithm rs = new RadixSort();
        int[] test = {170, 45, 75, 90, 802, 24, 2, 66};
        rs.sort(test);
        rs.printArray(test);
    }
}

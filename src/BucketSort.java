import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort extends SortAlgorithm {


    @Override
    public void sort(int[] arr) {
        sort(arr, 10);
    }

    public void sort(int[] arr, int k) {
        List<List<Integer>> bucket = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            bucket.add(new ArrayList<>());
        }

        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = getBucketIndex(k, max, arr[i]);
            bucket.get(bucketIndex).add(arr[i]);
        }
        int index = 0;
        for (int i = 0; i < k; i++) {
            Collections.sort(bucket.get(i));
            for (int num : bucket.get(i)) {
                arr[index++] = num;
            }
        }
    }

    private int getBucketIndex(int k, int max, int curr) {
        return curr / max == 1 ? (k - 1) :  curr / max * k;
    }

    public static void main(String[] args) {
        SortAlgorithm bs = new BucketSort();
        int[] test = new int[]{4, 2, 2, 8, 3, 3, 1, 9, 7};
        bs.sort(test);
        bs.printArray(test);
    }
}

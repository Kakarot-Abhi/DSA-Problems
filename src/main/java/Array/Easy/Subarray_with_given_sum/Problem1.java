package Array.Easy.Subarray_with_given_sum;

import java.util.ArrayList;

public class Problem1 {
    public ArrayList<Integer> findContinuousSubArray(int[] arr, int n, int s) {
//        TODO: Need to optimize more
        int start = 0;
        int end = 0;
        int sum = 0;
        ArrayList<Integer> pair = new ArrayList<Integer>();

        while (end <= n && start < n) {
            if (sum > s && start <= end) {
                sum = sum - arr[start];
                start++;
            } else if (s == sum) {
                pair.add(start + 1);
                pair.add(end);
                break;
            } else {
                if(end == n )
                    continue;
                sum += arr[end];
                end++;
            }
        }

        if (pair.isEmpty()) {
            pair.add(-1);
        }

        return pair;
    }
}

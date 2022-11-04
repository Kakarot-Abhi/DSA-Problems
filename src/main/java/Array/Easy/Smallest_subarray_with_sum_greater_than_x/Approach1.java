package Array.Easy.Smallest_subarray_with_sum_greater_than_x;

import java.util.Arrays;

public class Approach1 {

    public int smallestSubWithSum(int[] A, int N, int X) {
        int sum = Arrays.stream(A).sum();

        Arrays.sort(A);

        int counter = 0;

        for (int i = 0; i < N; i++) {

            if (sum > X)
                counter++;
            else {
                break;
            }

            sum -= A[i];

        }

        return N - counter;
    }
}

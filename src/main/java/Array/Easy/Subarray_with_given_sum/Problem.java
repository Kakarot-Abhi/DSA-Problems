package Array.Easy.Subarray_with_given_sum;

import java.util.ArrayList;

public class Problem {

    /*
    Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.



Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.
     */

    public void test() {

        int arr[] = new int[]{1, 2, 3, 7, 5};
        int N = 5;
        int S = 12;

        findContinuousSubArray(arr, N, S);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        N = 10;
        S = 15;

        findContinuousSubArray(arr, N, S);

        arr = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        N = 42;
        S = 468;

        findContinuousSubArray(arr, N, S);

    }

    public ArrayList<Integer> findContinuousSubArray(int[] arr, int n, int s) {

//        TODO: Need to optimize more

        ArrayList<Integer> result = new ArrayList<>();
        int sumStartIndex = 0;// to track starting position from where our sum is calculated
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > s) {
                actualSum = arr[i];
                sumStartIndex = i;
                continue;
            } else {

                actualSum += arr[i];


                while (actualSum > s) {
                    actualSum -= arr[sumStartIndex];
                    sumStartIndex++;
                }
            }

            if (actualSum == s) {
                // here we added 1 since we have started indexing from 0
                result.add((sumStartIndex + 1));
                result.add((i + 1));
                break;
            }
        }

        if (result.size() == 0)
            result.add(-1);

        return result;
    }


}

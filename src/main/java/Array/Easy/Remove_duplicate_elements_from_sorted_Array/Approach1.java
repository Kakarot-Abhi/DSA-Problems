package Array.Easy.Remove_duplicate_elements_from_sorted_Array;

public class Approach1 {

    public int remove_duplicate(int[] A, int N) {
        int start = 0;
        int end = 1;
        int nextGreater = 1;

        while ((end <= N || start <= end) && (nextGreater < N)) {
            if (A[start] < A[end]) {
                start++;
                end++;
                nextGreater = end;
                continue;
            }

            if (A[start] == A[end] && end == nextGreater) {
                nextGreater++;
                continue;
            }

            if (A[start] == A[nextGreater] && (A[start] == A[end] || (A[start] > A[end]))) {
                nextGreater++;
                continue;
            }

            if (A[start] < A[nextGreater]) {
                int temp = A[nextGreater];
                A[nextGreater] = A[end];
                A[end] = temp;

                start++;
                end++;
                continue;
            }

            if (A[start] > A[end]) {
                nextGreater++;
            }
        }

        return start + 1;
    }
}


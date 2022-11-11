package Array.Easy.Remove_duplicate_elements_from_sorted_Array;

public class Approach1 {

    public int remove_duplicate(int[] A, int N) {

        int MARKER = Integer.MIN_VALUE;
        int pointer1 = 0;// indicate index of starting duplicate element
        int pointer2 = 1;// indicate index of ending duplicate element
        int uniqueElementCount = 1;  // here we assume atleast 1 element to be unique


        for (int index = 0; index < N; index++) {
            if (A[pointer1] == A[pointer2]) {
                A[pointer2] = MARKER;
            } else {
                pointer1 = pointer2;
                uniqueElementCount++;
            }
            pointer2++;
            if (pointer2 == N)
                break;
        }

        for (int index = 0; index < N; index++) {

        }

        int[] uniqueElements = new int[uniqueElementCount];

        for (int index = 0, uniqueIndex = 0; index < N; index++) {
            if (A[index] == MARKER)
                continue;
            uniqueElements[uniqueIndex++] = A[index];
        }

        return 0;
    }
}


package search.binary_search.Floor_in_a_Sorted_Array;

public class Approach1 {

    public int findFloor(int arr[], int N, int X) {

        int start = 0;
        int end = N - 1;

        int startBand = -1, endBand = -1;

        if (N == 0) return -1;

        boolean isAcendingOrder = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == N) {
                return mid;
            }

            if (isAcendingOrder) {
                if (arr[mid] > N) {
                    end = mid - 1;
                    endBand = end;
                } else {
                    start = mid + 1;
                    startBand = start;
                }
            } else {
                if (arr[mid] > N) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return startBand;

//        return -1;
    }
}


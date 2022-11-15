package search.binary_search;

public class Approach1 {

    public int binarysearch(int arr[], int N, int K) {

        int start = 0;
        int end = N - 1;

        if (N == 0) return -1;

        boolean isAcendingOrder = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == K) {
                return mid;
            }

            if (isAcendingOrder) {
                if (arr[mid] > K) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > K) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}


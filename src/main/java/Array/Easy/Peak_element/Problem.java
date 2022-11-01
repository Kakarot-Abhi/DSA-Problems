package Array.Easy.Peak_element;

public class Problem {

    public int peakElement(int[] arr, int n) {

        int peakEleIndex = 0;

        for (int i = 0; i < n; i++) {
            int previousElement = i == 0 ? Integer.MIN_VALUE : arr[i - 1];
            int currentElement = arr[i];
            int nextElement = i == n - 1 ? Integer.MIN_VALUE : arr[i + 1];

            if (previousElement <= currentElement && currentElement >= nextElement) {
                peakEleIndex = i;
                continue;
            }
        }

        return peakEleIndex;
    }
}

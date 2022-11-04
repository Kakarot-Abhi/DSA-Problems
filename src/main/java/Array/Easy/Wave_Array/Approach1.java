package Array.Easy.Wave_Array;

public class Approach1 {

    public void convertToWave(int arr[], int n) {

        for (int index = 0; index < n; index += 2) {
            if (index == n - 1) break;
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
    }
}


package Array.Easy.Frequencies_of_Limited_Range_Array_Elements;
import java.util.HashMap;

public class approach2 {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int k = arr[i];
            if (map.containsKey(k)) {
                int pv = map.get(k);
                int newVal = pv + 1;
                map.put(k, newVal);
            } else {
                map.put(k, 1);
            }

        }

        for (int i = 0; i < N; i++) {
            if (map.containsKey(i + 1)) {
                arr[i] = map.get(i + 1);
            } else {
                arr[i] = 0;
            }
        }
    }
}

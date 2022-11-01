package Array.Easy.Frequencies_of_Limited_Range_Array_Elements;

import java.util.HashMap;

public class Problem {

    public void frequencyCount(int arr[], int N, int P) {

//        TODO: need to optimize more
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            Integer key = map.get(num);
            map.put(num, key == null ? 1 : key + 1);
        }

        for (int i = 0; i < N; i++) {
            Integer freq = map.getOrDefault(i + 1, 0);
            arr[i] = freq;
        }
    }

}

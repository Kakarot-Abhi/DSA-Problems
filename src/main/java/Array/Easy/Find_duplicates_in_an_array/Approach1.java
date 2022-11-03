package Array.Easy.Find_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Approach1 {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Set<Integer> duplicates = new HashSet<Integer>();
        Set<Integer> uniqueSet = new HashSet<Integer>();
        for (int num : arr) {
            if (!uniqueSet.add(num))
                duplicates.add(num);
        }

        if (duplicates.isEmpty())
            duplicates.add(-1);
        ArrayList<Integer> result = new ArrayList<Integer>(duplicates);
        Collections.sort(result);
        return result;
    }

}

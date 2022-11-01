package Array.Easy.Intersection_of_two_arrays;

import java.util.HashSet;

public class Problem {

    public int numberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int[] smallArr = a.length <= b.length ? a : b;
        int[] bigArr = a.length > b.length ? a : b;

        for (int num : smallArr) {
            set.add(num);
        }

        for (int i = 0; i < bigArr.length; i++) {
            if (set.remove(bigArr[i]))
                count++;
        }
        return count;
    }

}

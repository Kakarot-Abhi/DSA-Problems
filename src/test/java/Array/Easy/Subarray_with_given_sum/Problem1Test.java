package Array.Easy.Subarray_with_given_sum;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Subarray with given sum - approach1")
public class Problem1Test {
    public Problem1 problem1;

    @BeforeAll
    public void init() {
        problem1 = new Problem1();
    }

    @Test
    public void test1(){
        int arr[] = new int[]{1, 2, 3, 7, 5};
        int N = 5;
        int S = 12;
        ArrayList<Integer> continuousSubArray = problem1.findContinuousSubArray(arr, N, S);
        int[] actual = continuousSubArray.stream().mapToInt(i -> i).toArray();

        int[] expected = {2, 4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = 10;
        int S = 15;

        ArrayList<Integer> outputArray = problem1.findContinuousSubArray(arr, N, S);

        Assertions.assertArrayEquals(outputArray.stream().mapToInt(i -> i).toArray(), new int[]{1, 5});
    }

    @Test
    public void test3() {

        int arr[] = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        int N = 42;
        int S = 468;

        ArrayList<Integer> outputArray = problem1.findContinuousSubArray(arr, N, S);

        Assertions.assertArrayEquals(new int[]{38, 42}, outputArray.stream().mapToInt(i -> i).toArray());
    }

}
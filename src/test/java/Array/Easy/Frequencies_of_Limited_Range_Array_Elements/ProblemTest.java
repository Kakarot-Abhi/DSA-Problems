package Array.Easy.Frequencies_of_Limited_Range_Array_Elements;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Frequencies of Limited Range Array Elements")
public class ProblemTest {

    private Problem problem;

    @BeforeAll
    public void init() {
        problem = new Problem();
    }

    @Test
    public void test1() {

        int arr[] = new int[]{2, 3, 2, 3, 5};
        int N = 5;
        int P = 5;

        problem.frequencyCount(arr, N, P);

        int[] expected = {0, 2, 2, 0, 1};
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void test2() {

        int arr[] = new int[]{3, 3, 3, 3};
        int N = 4;
        int P = 3;

        problem.frequencyCount(arr, N, P);

        int[] expected = {0, 0, 4, 0};
        Assertions.assertArrayEquals(expected, arr);
    }

}
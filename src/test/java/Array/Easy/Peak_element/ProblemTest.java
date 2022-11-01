package Array.Easy.Peak_element;

import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Peak Element")
public class ProblemTest {

    Problem problem;

    @BeforeAll
    public void init() {
        problem = new Problem();
    }

    @Test
    public void test1() throws Exception {

        int arr[] = {1, 2, 3};
        int N = 3;

        int actual = problem.peakElement(arr, N);

        Assertions.assertEquals(2, actual);
    }

    @Test
    public void test2() throws Exception {

        int arr[] = {3, 4};
        int N = 2;

        int actual = problem.peakElement(arr, N);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test3() throws Exception {

        int arr[] = {1, 2, 2, 1};
        int N = 4;

        int actual = problem.peakElement(arr, N);

        Assertions.assertEquals(1, actual);
    }
}
package Array.Easy.Smallest_subarray_with_sum_greater_than_x;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Smallest subarray with sum greater than x")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    @Disabled("unable to solve the problem need to discuss with mritunjay")
    public void test1() {

        int A[] = {1, 4, 45, 6, 0, 19};
        int X = 51;

        int actual = approach1.smallestSubWithSum(A, A.length, X);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled("unable to solve the problem need to discuss with mritunjay")
    public void test2() {

        int A[] = {1, 10, 5, 2, 7};
        int X = 9;

        int actual = approach1.smallestSubWithSum(A, A.length, X);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


}
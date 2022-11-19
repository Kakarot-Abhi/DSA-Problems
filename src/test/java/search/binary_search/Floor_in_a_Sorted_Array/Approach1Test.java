package search.binary_search.Floor_in_a_Sorted_Array;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Floor_in_a_Sorted_Array")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() {

        int N = 7, X = 0;
        int arr[] = {1, 2, 8, 10, 11, 12, 19};


        int actual = approach1.findFloor(arr, N, X);

        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        int N = 7, X = 5;
        int arr[] = {1, 2, 8, 10, 11, 12, 19};


        int actual = approach1.findFloor(arr, N, X);

        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


}

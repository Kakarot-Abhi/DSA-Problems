package search.binary_search;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Binary_Search")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() {

        int arr[] = {};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 1);

        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test2() {

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 9);

        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test3() {

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 9);

        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test4() {

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 0);

        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test5() {

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 16);

        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test6() {

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int N = arr.length;

        int actual = approach1.binarysearch(arr, N, 8);

        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

}

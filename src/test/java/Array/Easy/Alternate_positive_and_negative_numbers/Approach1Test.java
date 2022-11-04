package Array.Easy.Alternate_positive_and_negative_numbers;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Alternate positive and negative numbers")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    @Disabled("pending beacause to O(n)")
    public void test1() {

        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int N = 9;

        approach1.rearrange(Arr, N);

        int[] expected = {9, -2, 4, -1, 5, -5, 0, -3, 2};
        int[] actual = Arr;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @Disabled("pending beacause to O(n)")
    public void test2() {

        int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int N = 10;

        approach1.rearrange(Arr, N);

        int[] expected = {5, -5, 2, -2, 4, -8, 7, 1, 8, 0};
        int[] actual = Arr;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test11() {

        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int N = 9;

        approach1.rearrange1(Arr, N);

        int[] expected = {9, -2, 4, -1, 5, -5, 0, -3, 2};
        int[] actual = Arr;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test22() {

        int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int N = 10;

        approach1.rearrange1(Arr, N);

        int[] expected = {5, -5, 2, -2, 4, -8, 7, 1, 8, 0};
        int[] actual = Arr;

        Assertions.assertArrayEquals(expected, actual);
    }

}
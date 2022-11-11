package Array.Easy.Remove_duplicate_elements_from_sorted_Array;

import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Remove_duplicate_elements_from_sorted_Array")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() {

        int A[] = {2, 2, 2, 2, 2};
        int N = 5;

        int actualElementCount = approach1.remove_duplicate(A, N);
        int[] expected = {2, 2, 2, 2, 2};

        int[] actual = Arrays.copyOf(A, actualElementCount);
        expected = Arrays.copyOf(expected, actualElementCount);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {

        int A[] = {1, 2, 2};
        int N = 3;

        int actualElementCount = approach1.remove_duplicate(A, N);
        int[] expected = {1, 2};

        int[] actual = Arrays.copyOf(A, actualElementCount);
        expected = Arrays.copyOf(expected, actualElementCount);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {

        int A[] = {1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
        int N = 42;

        int actualElementCount = approach1.remove_duplicate(A, N);
        int[] expected = {1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 70, 72, 79, 82, 83, 92, 93, 95, 96, 100};

        int[] actual = Arrays.copyOf(A, actualElementCount);
        expected = Arrays.copyOf(expected, actualElementCount);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {

        int A[] = {1, 2, 3, 3, 3, 4, 4, 5};
        int N = 8;

        int actualElementCount = approach1.remove_duplicate(A, N);
        int[] expected = {1, 2, 3, 4, 5, 3, 4, 3};

        int[] actual = Arrays.copyOf(A, actualElementCount);
        expected = Arrays.copyOf(expected, actualElementCount);

        Assertions.assertArrayEquals(expected, actual);
    }

}

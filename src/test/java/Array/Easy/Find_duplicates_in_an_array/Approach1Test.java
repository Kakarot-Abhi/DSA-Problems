package Array.Easy.Find_duplicates_in_an_array;


import org.junit.jupiter.api.*;
import util.Generator;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayNameGeneration(Generator.ParentPackage.class)
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() {
        int X = 4;
        int A[] = {0, 3, 1, 2};
        ArrayList<Integer> duplicates = approach1.duplicates(A, X);

        int[] actual = duplicates.stream().mapToInt(Integer::intValue).toArray();

        int[] expected = new int[]{-1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int X = 5;
        int A[] = {2, 3, 1, 2, 3};
        ArrayList<Integer> duplicates = approach1.duplicates(A, X);

        int[] actual = duplicates.stream().mapToInt(Integer::intValue).toArray();

        int[] expected = new int[]{2, 3};

        Assertions.assertArrayEquals(expected, actual);
    }


}
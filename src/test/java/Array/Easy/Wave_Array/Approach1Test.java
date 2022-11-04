package Array.Easy.Wave_Array;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Wave_Array")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() {

        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        approach1.convertToWave(arr, n);

        int[] expected = {2, 1, 4, 3, 5};


        // Please use Accordingly
        Assertions.assertArrayEquals(expected, arr);
        //Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        int[] arr = {2, 4, 7, 8, 9, 10};
        int n = 6;

        approach1.convertToWave(arr, n);


        int[] expected = {4, 2, 8, 7, 10, 9};

        // Please use Accordingly
        Assertions.assertArrayEquals(expected, arr);
        //Assertions.assertEquals(expected, actual);
    }

}

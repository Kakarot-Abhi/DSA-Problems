package Array.Easy.Peak_element2;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Peak_element2")
public class Approach1Test {

    private Approach1 approach1;

    @BeforeAll
    public void init() {
        approach1 = new Approach1();
    }

    @Test
    public void test1() throws Exception {

        int arr[] = {1, 2, 3};
        int N = 3;

        int actual = approach1.peakElement(arr, N);

        Assertions.assertEquals(2, actual);
    }

    @Test
    public void test2() throws Exception {

        int arr[] = {3, 4};
        int N = 2;

        int actual = approach1.peakElement(arr, N);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test3() throws Exception {

        int arr[] = {1, 2, 2, 1};
        int N = 4;

        int actual = approach1.peakElement(arr, N);

        Assertions.assertEquals(1, actual);
    }

}

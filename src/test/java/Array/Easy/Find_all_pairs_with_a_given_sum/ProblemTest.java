package Array.Easy.Find_all_pairs_with_a_given_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProblemTest {

    private Problem problem;

    @BeforeAll
    public void init() {
        problem = new Problem();
    }

    @Test
    public void test1() {

        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        int X = 9;

        Problem.pair[] allpairs = problem.findAllpairs(A, B, A.length, B.length, X);

        Assertions.assertArrayEquals(new Problem.pair[]
                {
                        problem.getPair(1, 8),
                        problem.getPair(4, 5),
                        problem.getPair(5, 4)
                }, allpairs);
    }

    @Test
    public void test2() {

        long A[] = {-1, -2, 4, -6, 5, 7};
        long B[] = {6, 3, 4, 0};
        int X = 8;

        Problem.pair[] allpairs = problem.findAllpairs(A, B, A.length, B.length, X);

        Assertions.assertArrayEquals(new Problem.pair[]
                {
                        problem.getPair(4, 4),
                        problem.getPair(5, 3)
                }, allpairs);
    }

    @Test
    public void test3() {
        long A[] = {-113, 147, 65, 37, 6, -27, -73, 109, 31, -8, -102, -74, -183, -186, 131, 40, 150, -123, -111, -91, 176, 170, -4, -165, -49, 93, -68, 142, 171, 98, -60, -196, 99, 69, 138, -20, -143, -63, 129, -158, -103, -30, 73, 32, 151, 136, 82, -150, -31, -37, -164, 101, -69, -62, -100, -14, 111, -97, 119, -137, 68, -130, -127, -161, 124};
        long B[] = {-122, 102, -67, 152, -169, 48, -52, -134, 33, -91, 188, 6, -148, -109, -35, 64, 32, 75, 198, 22, 65, -168, 185, -66, -127, -147, 145, -29, 104, 51, 93, 71, 129, 39, 76, 10, 70};

        int X = 2;

        Problem.pair[] actual = problem.findAllpairs(A, B, A.length, B.length, X);

        Problem.pair[] expected = {
                problem.getPair(-196, 198),
                problem.getPair(-186, 188),
                problem.getPair(-183, 185),
                problem.getPair(-150, 152),
                problem.getPair(-143, 145),
                problem.getPair(-127, 129),
                problem.getPair(-102, 104),
                problem.getPair(-100, 102),
                problem.getPair(-91, 93),
                problem.getPair(-74, 76),
                problem.getPair(-73, 75),
                problem.getPair(-69, 71),
                problem.getPair(-68, 70),
                problem.getPair(-63, 65),
                problem.getPair(-62, 64),
                problem.getPair(-49, 51),
                problem.getPair(-37, 39),
                problem.getPair(-31, 33),
                problem.getPair(-30, 32),
                problem.getPair(-20, 22),
                problem.getPair(-8, 10),
                problem.getPair(-4, 6),
                problem.getPair(31, -29),
                problem.getPair(37, -35),
                problem.getPair(68, -66),
                problem.getPair(69, -67),
                problem.getPair(93, -91),
                problem.getPair(111, -109),
                problem.getPair(124, -122),
                problem.getPair(129, -127),
                problem.getPair(136, -134),
                problem.getPair(150, -148),
                problem.getPair(170, -168),
                problem.getPair(171, -169)
        };

        Assertions.assertArrayEquals(expected, actual);
    }
}
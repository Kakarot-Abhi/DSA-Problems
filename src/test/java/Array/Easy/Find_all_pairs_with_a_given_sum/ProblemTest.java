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
}
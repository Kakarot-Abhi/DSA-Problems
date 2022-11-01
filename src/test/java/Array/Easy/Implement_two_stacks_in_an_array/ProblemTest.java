package Array.Easy.Implement_two_stacks_in_an_array;

import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Implement two stacks in an array")
public class ProblemTest {

    Problem problem;

    @BeforeAll
    public void init() {
        problem = new Problem();
    }

    @Test
    public void test1() throws Exception {
        TwoStack twoStack = new TwoStack();

        problem.push1(2, twoStack);
        problem.push1(3, twoStack);
        problem.push2(4, twoStack);

        int actual = problem.pop1(twoStack);
        Assertions.assertEquals(3, actual);

        actual = problem.pop2(twoStack);
        Assertions.assertEquals(4, actual);

        actual = problem.pop2(twoStack);
        Assertions.assertEquals(-1, actual);
    }
}
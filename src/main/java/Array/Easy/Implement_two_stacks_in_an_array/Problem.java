package Array.Easy.Implement_two_stacks_in_an_array;

public class Problem {

    void push1(int x, TwoStack sq) throws Exception {
        if (sq.top1 + 1 < sq.top2)
            sq.arr[++sq.top1] = x;

        else {
            throw new Exception("Stack 1 is full");
        }
    }

    void push2(int x, TwoStack sq) throws Exception {
        if (sq.top1 < sq.top2 - 1)
            sq.arr[--sq.top2] = x;

        else {
            throw new Exception("Stack 2 is full");
        }
    }

    int pop1(TwoStack sq) {
        if (sq.top1 == -1)
            return -1;
        return sq.arr[sq.top1--];
    }

    int pop2(TwoStack sq) {
        if (sq.top2 == sq.size)
            return -1;
        return sq.arr[sq.top2++];
    }
}

class TwoStack {

    int size;
    int top1, top2;
    int arr[] = new int[100];

    TwoStack() {
        size = 100;
        top1 = -1;
        top2 = size;
    }
}

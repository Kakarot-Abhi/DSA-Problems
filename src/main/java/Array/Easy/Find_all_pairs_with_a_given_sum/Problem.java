package Array.Easy.Find_all_pairs_with_a_given_sum;

import java.util.ArrayList;
import java.util.Objects;

public class Problem {

    public pair getPair(long first, long second) {
        return new pair(first, second);
    }

    public void test() {
        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        int X = 9;

        findAllpairs(A, B, A.length, B.length, X);
    }

    public pair[] findAllpairs(long A[], long B[], long N, long M, long X) {
        int resultSize = A.length > B.length ? B.length : A.length;

        ArrayList<pair> pairs = new ArrayList<>(resultSize);
        for (int indexA = 0; indexA < A.length; indexA++) {
            long pairFromA = A[indexA];
            for (int indexB = 0; indexB < B.length; indexB++) {
                long pairFromB = B[indexB];
                if ((pairFromA + pairFromB) == X) {
                    pairs.add(getPair(pairFromA, pairFromB));
                }
            }
        }

        pairs.trimToSize();

        pairs.sort((i1, i2) -> (i1.first == i2.first) ? 0 : ((i1.first > i2.first) ? 1 : -1));

        pair[] resultPair = new pair[pairs.size()];

        pairs.toArray(resultPair);
        return resultPair;
    }

    class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pair pair = (pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return "pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
}

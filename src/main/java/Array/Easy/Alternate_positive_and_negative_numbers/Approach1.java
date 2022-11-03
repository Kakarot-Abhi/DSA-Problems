package Array.Easy.Alternate_positive_and_negative_numbers;

import java.util.ArrayDeque;
import java.util.Queue;

public class Approach1 {


    public void rearrange1(int arr[], int n) {

        Queue<Integer> positive = new ArrayDeque<>();
        Queue<Integer> negative = new ArrayDeque<>();

        for (int num : arr) {
            if (num >= 0)
                positive.add(num);
            else
                negative.add(num);
        }

        for (int i = 0; i < n; i++) {
            int num = (i % 2 == 0) ? (positive.isEmpty() ? negative.poll() : positive.poll()) : (negative.isEmpty() ? positive.poll() : negative.poll());
            arr[i] = num;
        }
    }


    //TODO: need to work on this later
    public void rearrange(int arr[], int n) {
        int currentPositionIndex = 0;
        int currentPositiveIndex = 0;
        int currentNegativeIndex = 0;

        int positiveCounter = 0;
        int negativeCounter = 0;

        boolean isPositiveTurn = true;
        boolean isPositiveNumExist = false;
        boolean isNegativeNumExist = false;

        int loopCounter = 0;

        while (true) {
            System.out.println(loopCounter++);
            if (currentPositiveIndex > n && currentNegativeIndex > n || currentPositionIndex > n)
                break;

            if (positiveCounter < n) {
                if (arr[positiveCounter] >= 0 && !isPositiveNumExist && isPositiveTurn) {
                    currentPositiveIndex = positiveCounter;
                    isPositiveNumExist = true;
                    positiveCounter++;
                }
            } else {
                isPositiveTurn = false;
            }

            if (negativeCounter < n) {
                if (arr[negativeCounter] < 0 && !isNegativeNumExist && !isPositiveTurn) {
                    currentNegativeIndex = negativeCounter;
                    isNegativeNumExist = true;
                    negativeCounter++;
                }
            } else {
                isPositiveTurn = true;
            }

            int temp = arr[currentPositionIndex];

            if (isPositiveTurn) {
                if (isPositiveNumExist) {
                    arr[currentPositionIndex] = arr[currentPositiveIndex];
                    arr[currentPositiveIndex] = temp;
                    isPositiveNumExist = false;
                    currentPositionIndex++;
                    isPositiveTurn = false;
                } else {
                    positiveCounter++;
                }
            } else {
                if (isNegativeNumExist) {
                    arr[currentPositionIndex] = arr[currentNegativeIndex];
                    arr[currentNegativeIndex] = temp;
                    isNegativeNumExist = false;
                    isPositiveTurn = true;
                    currentPositionIndex++;
                } else {
                    negativeCounter++;
                }
            }
        }
    }

}

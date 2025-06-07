package main.FibonacciSequence;

public class FibonacciSequenceBottomUp {
    public int getFibonacciNumber(int n) {
        if (n == 1 || n == 2) return 1;

        int[] bottomUpArray = new int[n+1];
        bottomUpArray[1] = 1;
        bottomUpArray[2] = 1;
        for (int i = 3; i <= n; i++) {
            bottomUpArray[i] = bottomUpArray[i-1] + bottomUpArray[i-2];
        }
        return bottomUpArray[n];
    }
}

package main.FibonacciSequence;

public class FibonacciSequenceMemo {
    public int getFibonacciNumber(int n, Integer[] memo) {
        int result = 0;
        if (memo[n] != null) return memo[n];

        if (n == 1 || n == 2) {
            result = 1;
        } else {
            return getFibonacciNumber(n - 2, memo) + getFibonacciNumber(n - 1, memo);
        }
         memo[n] = result;
        return result;
    }
}

package main.FibonacciSequence;

public class FibonacciSequenceRecursive {
    public int getFibonacciNumber(int n) {
        int result = 0;
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
        }
        return result;
    }
}

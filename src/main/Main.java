package main;

import main.CutRod.CutRodBottomUp;
import main.CutRod.CutRodMemo;
import main.CutRod.CutRodRecursive;
import main.FibonacciSequence.FibonacciSequenceBottomUp;
import main.FibonacciSequence.FibonacciSequenceMemo;
import main.FibonacciSequence.FibonacciSequenceRecursive;
import main.LCS.LCSBottomUp;
import main.LCS.LCSMemo;
import main.LCS.LCSRecursive;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {

        // print the result with the execution of the method of FibonacciSequenceRecursive class
        FibonacciSequenceRecursive recursiveVar = new FibonacciSequenceRecursive();
        System.out.println(recursiveVar.getFibonacciNumber(10));

        // print the result with the execution of the method of FibonacciSequenceMemo class
        FibonacciSequenceMemo memoVar = new FibonacciSequenceMemo();
        Integer[] memo = new Integer[10];
        System.out.println(memoVar.getFibonacciNumber(6, memo));

        // print the result with the execution of the method of FibonacciSequenceBottomUp class
        FibonacciSequenceBottomUp bottomVar = new FibonacciSequenceBottomUp();
        System.out.println(bottomVar.getFibonacciNumber(10));

        // print the result with the execution of the method of LCSRecursive class
        LCSRecursive lcsRecursive = new LCSRecursive();
        String A = "nematode";
        String B = "empty";
        System.out.println(lcsRecursive.getLongestCommonSubsequence(A, B, A.length(), B.length()));

        // print the result with the execution of the method of LCSMemo class
        LCSMemo lcsMemo = new LCSMemo();
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(lcsMemo.getLongestCommonSubsequence(A, B, A.length(), B.length(), dp));

        // print the result with the execution of the method of LCSMemo class
        LCSBottomUp lcsBottomUp = new LCSBottomUp();
        System.out.println(lcsBottomUp.getLongestCommonSubsequence(A, B));

        // print the result with the execution of the method of CutRodRecursive class
        CutRodRecursive cutRodRecursive = new CutRodRecursive();
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int rodLength = 9;
        System.out.println(cutRodRecursive.getProfitFromCutting(prices, rodLength));

        // print the result with the execution of the method of CutRodRecursive class
        CutRodMemo cutRodMemo = new CutRodMemo();
        System.out.println(cutRodMemo.getProfitFromCutting(prices, rodLength));

        // print the result with the execution of the method of CutRodBottomUp class
        CutRodBottomUp cutRodBottomUp = new CutRodBottomUp();
        System.out.println(cutRodBottomUp.getProfitFromCutting(prices, rodLength));
    }
}
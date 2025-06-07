package main.LCS;

public class LCSMemo {
    public int getLongestCommonSubsequence(String first, String second, int i, int j, int[][] memo) {
        if (i == 0 || j == 0) return 0;

        if (memo[i][j] != -1) return memo[i][j]; // feature of memoization

        if (first.charAt(i - 1) == second.charAt(j - 1)) {
            memo[i][j] = 1 + getLongestCommonSubsequence(first, second, i - 1, j - 1, memo);
        } else {
            memo[i][j] = Math.max(
                    getLongestCommonSubsequence(first, second, i - 1, j, memo),
                    getLongestCommonSubsequence(first, second, i, j - 1, memo)
            );
        }
        return memo[i][j];
    }
}

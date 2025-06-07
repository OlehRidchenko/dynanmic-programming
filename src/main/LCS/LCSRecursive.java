package main.LCS;

public class LCSRecursive {
    public int getLongestCommonSubsequence(String first, String second, int i, int j) {
        if (i == 0 || j == 0) return 0;

        if (first.charAt(i - 1) == second.charAt(j - 1)) {
            return 1 + getLongestCommonSubsequence(first, second, i - 1, j - 1);
        } else {
            return Math.max(getLongestCommonSubsequence(first, second, i - 1, j),
                    getLongestCommonSubsequence(first, second, i, j - 1)
            );
        }
    }
}

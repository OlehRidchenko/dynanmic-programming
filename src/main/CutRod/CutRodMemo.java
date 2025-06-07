package main.CutRod;

public class CutRodMemo {
    public int getProfitFromCutting(int[] price, int n) {
        int[] memo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            memo[i] = Integer.MIN_VALUE;
        }
        return memoizedCutRod(price, n, memo);
    }

    public int memoizedCutRod(int[] price, int n, int[] memo) {
        if (memo[n] >= 0) return memo[n];

        int q;
        if (n == 0) {
            q = 0;
        } else {
            q = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                q = Math.max(q, price[i - 1] + memoizedCutRod(price, n - i, memo));
            }
        }
        memo[n] = q;
        return q;
    }

}

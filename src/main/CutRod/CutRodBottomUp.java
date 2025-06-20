package main.CutRod;

public class CutRodBottomUp {
    public int getProfitFromCutting(int[] price, int n) {
        int[] r = new int[n + 1];
        r[0] = 0;

        for (int j = 1; j <= n; j++) {
            int q = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                q = Math.max(q, price[i - 1] + r[j - i]);
            }
            r[j] = q;
        }

        return r[n];
    }
}

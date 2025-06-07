package main.CutRod;

public class CutRodRecursive {
    public int getProfitFromCutting(int[] price, int n) {
        if (n == 0) return 0;
        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            q = Math.max(q,
                    price[i - 1] + getProfitFromCutting(price, n - i)
            );
        }

        return q;
    }
}

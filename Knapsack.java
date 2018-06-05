import org.junit.Test;

public class Knapsack {
    //    public int knapsack(int W, int N, int[] weights, int[] values) {
//        int[][] dp = new int[N + 1][W + 1];
//        for (int i = 1; i <= N; i++) {
//            int w = weights[i - 1], v = values[i - 1];
//            for (int j = 1; j <= W; j++) {
//                if (j >= w) {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        return dp[N][W];
//    }
    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i - 1], v = values[i - 1];
            for (int j = W; j >= 1; j--) {
                if (j >= w) {
                    dp[j] = Math.max(dp[j], dp[j - w] + v);
                }
            }
        }
        return dp[W];
    }

    @Test
    public void test() {
        int w = 10;
        int n = 5;
        int[] weights = {2, 2, 6, 5, 4};
        int[] values = {6, 3, 5, 4, 6};
        System.out.println(knapsack(w, n, weights, values));
    }
}

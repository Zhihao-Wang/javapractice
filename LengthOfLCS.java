import org.junit.Test;

public class LengthOfLCS {
    public int lengthOfLCS(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (nums1[i - 1] == nums2[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                     dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n1][n2];
    }

    @Test
    public void testLCS(){
        int[] a = {4,5,6,7};
        int[] b = {2,5,7};
        System.out.println(lengthOfLCS(a,b));
    }
}

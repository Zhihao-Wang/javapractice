import org.junit.Test;

public class PartitionEqual {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int W = sum / 2;
        boolean[] dp = new boolean[W + 1];
        dp[0] = true;
        for (int num : nums) {               // 0-1 背包一个物品只能用一次
            for (int i = W; i >= 0; i--) {   // 从后往前，先计算 dp[i] 再计算 dp[i-num]
                if (num <= i) {
                    dp[i] = dp[i] || dp[i - num];
                }
            }
        }
        return dp[W];
    }

    @Test
    public void test(){
        int[] nums = {1,5,4,7,5};
        System.out.println(canPartition(nums));
    }
}

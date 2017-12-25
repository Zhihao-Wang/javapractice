//数组最大子序列的和
public class MaxSum {
    public static int MaxSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i != arr.length; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-2,-4,-5,-3,-1,-8,-4,-6,-7,-4};
        MaxSum(arr);

    }
}

public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[] dp = new int[nums.length];
        for (int start = nums.length; start >= 0; start--) {
            for (int end = start; end < nums.length; end++) {
                if (start == end) {
                    dp[start] = nums[start];
                } else {
                    int a = nums[start] - dp[end];
                    int b = nums[end] - dp[end - 1];
                    dp[end] = Math.max(a, b);
                }
            }
        }
        return dp[nums.length - 1] >= 0;
    }
}
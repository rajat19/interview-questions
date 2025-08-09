class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return maxSum(arr, k, dp, arr.length, 0);
    }

    private int maxSum(int[] arr, int k, int[] dp, int n, int start) {
        if (start >= n) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int max = 0, ans = 0;
        int end = Math.min(n, start + k);
        for(int i = start; i < end; i++) {
            max = Math.max(max, arr[i]);
            ans = Math.max(ans, max*(i-start+1) + maxSum(arr, k, dp, n, i+1));
        }
        return dp[start] = ans;
    }
}
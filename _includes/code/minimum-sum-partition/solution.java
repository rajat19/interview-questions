class Solution
{
    public int minDifference(int arr[], int n) {
        if (n==0) return 0;
        if (n==1) return arr[0];
        if (n==2) return Math.abs(arr[1] - arr[0]);
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        int W = sum/2;
        int[][] dp = new int[n+1][W+1];
        for(int i=1; i<= n; i++) {
            for(int j=1; j<= W; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j], arr[i-1] + dp[i-1][j-arr[i-1]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return Math.abs(sum - 2*dp[n][W]);
    }
}
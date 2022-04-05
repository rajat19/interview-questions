class Solution {
public:
    bool PredictTheWinner(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n, 0);
        for(int start=n-1; start>=0; start--) {
            for(int end=start; end<n; end++) {
                if (start == end) {
                    dp[start] = nums[start];
                } else {
                    int a = nums[start] - dp[end];
                    int b = nums[end] - dp[end - 1];
                    dp[end] = max(a, b);
                }
            }
        }
        return dp[n-1] >= 0;
    }
};
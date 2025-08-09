class Solution {
public:
    bool isMatch(string text, string pattern) {
        int n1 = text.size();
        int n2 = pattern.size();
        vector<vector<bool>> dp(n1+1, vector<bool>(n2+1, false));
        dp[0][0] = true;
        for (int j = 1; j <= n2; j++) {
            if (pattern[j - 1] == '*') dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (text[i - 1] == pattern[j - 1] || pattern[j - 1] == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n1][n2];
    }
};
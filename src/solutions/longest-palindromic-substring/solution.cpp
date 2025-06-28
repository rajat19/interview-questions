class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.length(), start = 0, end=0;
        bool dp[n][n];
        memset(dp, false, sizeof(dp));
        for(int i=n-1; i>=0; i--) {
            for(int j=i; j<n; j++) {
                if (s[i] == s[j] && (j-i <= 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                }
                if (dp[i][j] && j-i > end-start) {
                    end = j;
                    start = i;
                }
            }
        }
        return s.substr(start, end-start+1);
    }
};
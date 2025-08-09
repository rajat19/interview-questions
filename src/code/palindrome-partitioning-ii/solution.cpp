class Solution {
public:
    int minCut(string s) {
        int n =s.length();
        bool dp[n][n];
        memset(dp, 0, sizeof(dp));
        int cut[n];
        for(int i=0; i<n; i++) {
            int mincut = i;
            for(int j=0; j<=i; j++) {
                if (s[i] == s[j] && (i-j < 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    mincut = min(mincut, j==0 ? 0 : cut[j-1]+1);
                }
            }
            cut[i] = mincut;
        }
        return cut[n-1];
    }
};
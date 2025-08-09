class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        int n = s.length();
        vector<bool> dp(n, false);
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                string sub = s.substr(j, i-j+1);
                if (contains(wordDict, sub) && (j==0 || dp[j-1])) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }

    bool contains(vector<string> &v, string s) {
        return find(v.begin(), v.end(), s) != v.end();
    }
};
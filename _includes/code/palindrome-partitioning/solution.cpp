class Solution {
public:
    vector<vector<string>> partition(string s) {
        int n = s.length();
        vector<vector<string>> result;
        vector<vector<bool>> dp(n, vector<bool>(n, false));
        vector<string> current;
        backtrack(s, dp, 0, current, result);
        return result;
    }

    void backtrack(string s, vector<vector<bool>> &dp, int start, vector<string> &current, vector<vector<string>> &result) {
        if (start >= s.length()) {
            result.push_back(current);
            return;
        }
        for(int pos=start; pos<s.length(); pos++) {
            if (s[start] == s[pos] && (pos - start <= 2 || dp[start+1][pos-1])) {
                dp[start][pos] = true;
                current.push_back(s.substr(start, pos+1-start));
                backtrack(s, dp, pos+1, current, result);
                current.pop_back();
            }
        }
    }
};
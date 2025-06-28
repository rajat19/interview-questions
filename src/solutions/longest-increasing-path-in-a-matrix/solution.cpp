class Solution {
public:
    int dir[5] = {-1, 0, 1, 0, -1};
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
        vector<vector<int>> dp(m, vector<int>(n, 0));
        int mx = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mx = max(mx, dfs(i, j, matrix, dp, m, n));
            }
        }
        return mx;
    }

    int dfs(int i, int j, vector<vector<int>> &matrix, vector<vector<int>> &dp, int m, int n) {
        if (dp[i][j] != 0) return dp[i][j];
        int mx = 1;
        for(int k=0; k<4; k++) {
            int x = i+dir[k], y = j+dir[k+1];
            if (x < 0 || y < 0 || x >= m || y >= n || matrix[x][y] <= matrix[i][j]) continue;
            mx = max(mx, 1+dfs(x, y, matrix, dp, m, n));
        }
        return dp[i][j] = mx;
    }
};
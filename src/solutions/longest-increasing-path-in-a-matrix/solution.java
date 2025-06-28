class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                max = Math.max(max, dfs(matrix, dp, i, j, n, m));
            }
        }
        return max;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j, int n, int m) {
        if (dp[i][j] != 0) return dp[i][j];
        int[] dir = new int[]{-1, 0, 1, 0, -1};
        int max = 1;
        for(int k=0; k<4; k++) {
            int x = i+dir[k], y = j+dir[k+1];
            if (x<0 || y<0 || x>=n || y>=m || matrix[x][y] <= matrix[i][j]) continue;
            max = Math.max(max, 1+dfs(matrix, dp, x, y, n, m));
        }
        dp[i][j] = max;
        return max;
    }
}
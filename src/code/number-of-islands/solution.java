class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length, m = grid[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, n, m);
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid, int r, int c, int n, int m) {
        grid[r][c] = '2';
        if (r>0 && grid[r-1][c] == '1') dfs(grid, r-1, c, n, m);
        if (r<n-1 && grid[r+1][c] == '1') dfs(grid, r+1, c, n, m);
        if (c>0 && grid[r][c-1] == '1') dfs(grid, r, c-1, n, m);
        if (c<m-1 && grid[r][c+1] == '1') dfs(grid, r, c+1, n, m);
    }
}
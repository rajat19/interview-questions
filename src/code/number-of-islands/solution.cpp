class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
        int count = 0, m = grid.size(), n = grid[0].size();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }

private:
    void dfs(vector<vector<char>> &grid, int row, int col, int rowsize, int colsize) {
        if (row < 0 || row >= rowsize || col <0 || col >= colsize || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row-1, col, rowsize, colsize);
        dfs(grid, row+1, col, rowsize, colsize);
        dfs(grid, row, col-1, rowsize, colsize);
        dfs(grid, row, col+1, rowsize, colsize);
    }
};
class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
        int mx = 0;
        int count[1] = {0};
        for(int i=0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if (grid[i][j] == 1) {
                    count[0] = 0;
                    dfs(grid, n, m, i, j, count);
                    mx = max(count[0], mx);
                }
            }
        }
        return mx;
    }

    void dfs(vector<vector<int>> &grid, int n, int m, int x, int y, int* count) {
        count[0]++;
        grid[x][y] = 2;
        int dir[5] = {-1,0,1,0,-1};
        for(int i=0; i<4; i++) {
            int nx = x+dir[i], ny = y+dir[i+1];
            if(nx>=0 && ny>=0 && nx<n && ny <m && grid[nx][ny] == 1) {
                dfs(grid,n,m,nx,ny,count);
            }
        }
    }
};
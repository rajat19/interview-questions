class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int max = 0;
        int[] count = new int[]{0};
        for(int i=0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if (grid[i][j] == 1) {
                    count[0] = 0;
                    dfs(grid, n, m, i, j, count);
                    max = Math.max(count[0], max);
                }
            }
        }
        return max;
    }

    private void dfs(int[][] grid, int n, int m, int x, int y, int[] count) {
        count[0]++;
        grid[x][y] = 2;
        int[] dir = new int[]{-1,0,1,0,-1};
        for(int i=0; i<4; i++) {
            int nx = x+dir[i], ny = y+dir[i+1];
            if(nx>=0 && ny>=0 && nx<n && ny <m && grid[nx][ny] == 1) {
                dfs(grid,n,m,nx,ny,count);
            }
        }
    }
}
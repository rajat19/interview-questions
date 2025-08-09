class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int[] row = new int[n], col = new int[n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int nh = Math.min(row[i], col[j]);
                if (nh > grid[i][j]) sum += nh - grid[i][j];
            }
        }
        return sum;
    }
}
class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[m];
        for(int j=0; j<m; j++) {
            int startCol = j;
            for(int i=0; i<n; i++) {
                int endCol = startCol + grid[i][startCol];
                if (endCol < 0 || endCol >= m || grid[i][endCol] != grid[i][startCol]) {
                    startCol = -1;
                    break;
                }
                startCol = endCol;
            }
            res[j] = startCol;
        }
        return res;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        int n = grid.length, m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        int steps = 1;
        int[] dx = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] dy = new int[]{-1,0,1,-1,1,-1,0,1};
        while(!q.isEmpty()) {
            int qs = q.size();
            for(int i=0; i<qs; i++) {
                int[] first = q.poll();
                if (grid[first[0]][first[1]] != 0) continue;
                grid[first[0]][first[1]] = 1;
                if (first[0] == n-1 && first[1] == m-1) {
                    return steps;
                }
                for(int j=0; j<8; j++) {
                    int nx = first[0] + dx[j], ny = first[1]+dy[j];
                    if (nx>=0 && ny >=0 && nx<n && ny<m && grid[nx][ny] == 0) {
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int graph[][] = new int[n][n];
        for (int i = 0; i < flights.length; i++) {
            graph[flights[i][0]][flights[i][1]] = flights[i][2];
        }
        int ans = findCheapestPrice(src, dst, graph, k + 1, new int[n + 1][n + 1][k + 2]);
        return ans >= 1000000 ? -1 : ans;
    }

    int findCheapestPrice(int src, int dst, int graph[][], int k, int dp[][][]) {
        if (dst == src) {
            return 0;
        }
        if (k == 0) {
            return 1000000;
        }
        if (dp[src][dst][k] != 0) {
            return dp[src][dst][k];
        }
        int min = 1000000;
        for (int i = 0; i < graph[src].length; i++) {
            if (graph[src][i] != 0) {
                min = Math.min(min, graph[src][i] + findCheapestPrice(i, dst, graph, k - 1, dp));
            }
        }
        return dp[src][dst][k] = min;
    }
}
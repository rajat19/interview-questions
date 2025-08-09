class Solution {
    public int minCut(String s) {
        int n =s.length();
        boolean[][] dp = new boolean[n][n];
        int[] cut= new int[n];
        for(int i=0; i<n; i++) {
            int mincut = i;
            for(int j=0; j<=i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i-j < 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    mincut = Math.min(mincut, j==0 ? 0 : cut[j-1]+1);
                }
            }
            cut[i] = mincut;
        }
        return cut[n-1];
    }
}
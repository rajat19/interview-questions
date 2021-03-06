class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), start = 0, end=0;
        boolean[][] dp = new boolean[n][n];
        for(int i=n-1; i>=0; i--) {
            for(int j=i; j<n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                }
                if (dp[i][j] && j-i > end-start) {
                    end = j;
                    start = i;
                }
            }
        }
        return s.substring(start, end+1);
    }
}
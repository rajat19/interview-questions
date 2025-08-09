class Solution {
    public String longestPalindrome(String s) {
        int best = 0, start = 0, end = 0;
        for(int i=0; i<s.length(); i++) {
            int left = i-1;
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                i++;
            }

            int right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            if (right-left > best) {
                best = right - left;
                start = left+1;
                end = right;
            }
        }
        return s.substring(start, end);
    }
}

// Alternate solution using dp
// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length(), start = 0, end=0;
//         boolean[][] dp = new boolean[n][n];
//         for(int i=n-1; i>=0; i--) {
//             for(int j=i; j<n; j++) {
//                 if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])) {
//                     dp[i][j] = true;
//                 }
//                 if (dp[i][j] && j-i > end-start) {
//                     end = j;
//                     start = i;
//                 }
//             }
//         }
//         return s.substring(start, end+1);
//     }
// }
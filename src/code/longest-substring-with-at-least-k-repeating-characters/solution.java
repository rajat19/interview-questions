class Solution {
    public int longestSubstring(String s, int k) {
        int[] chars = new int[26];
        for(int i=0; i<s.length(); i++) {
            chars[s.charAt(i) - 'a'] += 1;
        }
        boolean flag = true;
        for(int i=0; i<26; i++) {
            if (chars[i] < k && chars[i] > 0) flag = false;
        }
        if (flag) return s.length();
        int pos = 0, max = 0, start = 0;
        while(pos < s.length()) {
            if (chars[s.charAt(pos) - 'a'] < k) {
                max = Math.max(max, longestSubstring(s.substring(start, pos), k));
                start = pos + 1;
            }
            pos++;
        }
        max = Math.max(max, longestSubstring(s.substring(start), k));
        return max;
    }
}
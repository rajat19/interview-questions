class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, max = 0;
        for(int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i))+1);
            }
            max = Math.max(max, i-start+1);
            map.put(s.charAt(i), i);
        }
        return max;
    }
}
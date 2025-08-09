class Solution {
    public boolean isScramble(String s1, String s2) {
        Map<String, Boolean> map = new HashMap<>();
        return isScramble(s1, s2, map);
    }

    public boolean isScramble(String s1, String s2, Map<String, Boolean> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);
        String key = sb.toString();
        if (map.containsKey(key)) return map.get(key);
        if (s1.equals(s2)) {
            map.put(key, true);
            return true;
        }
        int[] count = new int[26];
        int l = s1.length();
        for(int i=0; i<l; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++) {
            if (count[i] != 0) {
                map.put(key, false);
                return false;
            }
        }
        for(int i=1; i<=l-1; i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i), map) &&
                    isScramble(s1.substring(i), s2.substring(i), map)) {
                map.put(key, true);
                return true;
            }
            if (isScramble(s1.substring(0, i), s2.substring(l-i), map) &&
                    isScramble(s1.substring(i), s2.substring(0, l-i), map)) {
                map.put(key, true);
                return true;
            }
        }
        map.put(key, false);
        return false;
    }
}
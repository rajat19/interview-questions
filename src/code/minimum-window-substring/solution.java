class Solution {
    public String minWindow(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];
        int requiredChars = 0;
        char c;
        for(int i=0; i<t.length(); i++) {
            c = t.charAt(i);
            if (tmap[c] == 0) requiredChars++;
            tmap[c]++;
        }
        int left = 0, right = 0;
        int foundChars = 0;
        int start = 0, end = 0, minlength = -1;
        while(right < s.length()) {
            c = s.charAt(right);
            smap[c]++;
            if (tmap[c] > 0 && tmap[c] == smap[c]) {
                foundChars++;
            }
            while(left <= right && foundChars == requiredChars) {
                c = s.charAt(left);
                if (minlength == -1 || minlength > right - left + 1) {
                    minlength = right - left + 1;
                    start = left;
                    end = right;
                }
                smap[c]--;
                if (tmap[c] > 0 && tmap[c] > smap[c]) {
                    foundChars--;
                }
                left++;
            }

            right++;
        }

        return minlength == -1 ? "" : s.substring(start, end+1);
    }
}
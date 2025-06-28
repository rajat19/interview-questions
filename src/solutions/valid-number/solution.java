class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean eseen = false, numseen = false, pointseen = false;
        for(int i=0; i<s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numseen = true;
            } else if (s.charAt(i) == '.') {
                if (pointseen || eseen) {
                    return false;
                }
                pointseen = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (eseen || !numseen) {
                    return false;
                }
                numseen = false;
                eseen = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && s.charAt(i-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return numseen;
    }
}
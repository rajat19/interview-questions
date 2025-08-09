class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if (n==0) return 0;
        int i=0;
        while(i<n && s.charAt(i) == ' ') {
            i++;
        }
        if (i==n) return 0;
        boolean isneg = false;
        if (s.charAt(i) != '-' && s.charAt(i) != '+' && s.charAt(i) < '0' && s.charAt(i) > '9') {
            return 0;
        }
        if (s.charAt(i) == '-') {
            isneg = true;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }
        long res = 0;
        while(i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            res = res*10 + s.charAt(i) - '0';
            if (res > Integer.MAX_VALUE) {
                break;
            }
            i++;
        }
        res = isneg ? Math.max(-res, Integer.MIN_VALUE) : Math.min(res, Integer.MAX_VALUE);
        return (int) res;
    }
}
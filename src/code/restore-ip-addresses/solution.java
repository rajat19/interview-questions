class Solution {
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        List<String> res = new ArrayList<>();
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k, n);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        res.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return res;
    }

    private boolean isValid(String s) {
        if (s.length() == 0) return false;
        if (s.length() > 3) return false;
        if (s.charAt(0) == '0' && s.length() > 1) return false;
        if (Integer.parseInt(s) > 255) return false;
        return true;
    }
}
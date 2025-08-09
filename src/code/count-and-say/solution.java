class Solution {
    public String countAndSay(int n) {
        String prev = "1";
        if (n==1) return prev;
        for(int k=2; k<=n; k++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i=1; i<prev.length(); i++) {
                if (prev.charAt(i) == prev.charAt(i-1)) {
                    count++;
                } else {
                    sb.append(count).append(prev.charAt(i-1));
                    count = 1;
                }
            }
            sb.append(count).append(prev.charAt(prev.length()-1));
            prev = sb.toString();
        }
        return prev;
    }
}
class Solution {
    String rotationalCipher(String input, int rotationFactor) {
        StringBuilder sb = new StringBuilder();
        int n = input.length();
        for(int i=0; i<n; i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                sb.append((char)('a' + (c - 'a' + rotationFactor)%26));
            }
            else if ('A' <= c && c <= 'Z') {
                sb.append((char)('A' + (c - 'A' + rotationFactor)%26));
            }
            else if ('0' <= c && c <= '9') {
                sb.append((char)('0' + (c - '0' + rotationFactor)%10));
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
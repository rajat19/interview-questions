class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) {
            return "0";
        }
        int top = 0;
        char[] ca = new char[num.length()];
        for(char c: num.toCharArray()){
            while(k>0 && top>0 && ca[top-1]>c){
                top--;
                k--;
            }
            ca[top++] = c;
        }
        int i = 0, len = top-k;
        while(i < len-1 && ca[i] == '0') {
            i++;
        }
        return String.valueOf(ca, i, len-i);
    }
}
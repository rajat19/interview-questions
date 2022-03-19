class Solution {
public:
    int calculate(string s) {
        stack<int> st;
        int result = 0, num = 0, sign = 1;
        st.push(sign);
        for(int i=0; i<s.length(); i++) {
            char c = s[i];
            if (c >= '0' && c <= '9') {
                num = num*10 - (int)'0' + (int) c;
            } else if (c == '+' || c == '-') {
                result += sign * num;
                sign = st.top() * (c == '+' ? 1: -1);
                num = 0;
            } else if (c == '(') {
                st.push(sign);
            } else if (c == ')'){
                st.pop();
            }
        }
        result += sign * num;
        return result;
    }
};
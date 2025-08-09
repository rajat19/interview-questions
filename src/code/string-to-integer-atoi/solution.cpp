class Solution {
public:
    int myAtoi(string s) {
        int n = s.length();
        if (n==0) return 0;
        int i=0;
        while(i<n && s[i] == ' ') {
            i++;
        }
        if (i==n) return 0;
        bool isneg = false;
        if (s[i] != '-' && s[i] != '+' && s[i] < '0' && s[i] > '9') {
            return 0;
        }
        if (s[i] == '-') {
            isneg = true;
            i++;
        }
        else if (s[i] == '+') {
            i++;
        }
        long res = 0;
        while(i<n && s[i] >= '0' && s[i] <= '9') {
            res = res*10 + s[i] - '0';
            if (res > INT_MAX) {
                break;
            }
            i++;
        }
        res = isneg ? (-res > INT_MIN ? -res : INT_MIN) : (res < INT_MAX ? res : INT_MAX);
        return (int) res;
    }
};
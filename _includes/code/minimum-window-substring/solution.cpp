class Solution {
public:
    string minWindow(string s, string t) {
        int tmap[256] = {0}, smap[256] = {0};
        int requiredChars = 0, foundChars = 0;
        int left = 0, right = 0, minlength = -1, start = 0, end=0;
        char c;
        for(int i=0; i<t.length(); i++) {
            char c = t[i];
            if (tmap[c] == 0) requiredChars++;
            tmap[c]++;
        }
        while(right < s.length()) {
            c = s[right];
            smap[c]++;
            if (tmap[c] > 0 && tmap[c] == smap[c]) {
                foundChars++;
            }
            while(left <= right && foundChars == requiredChars) {
                c = s[left];
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
        return minlength == -1 ? "" : s.substr(start, minlength);
    }
};
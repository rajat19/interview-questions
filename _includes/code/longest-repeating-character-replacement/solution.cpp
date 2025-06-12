class Solution {
public:
    int characterReplacement(string s, int k) {
        int maxfreq = 0, left = 0, ans = 0;
        vector<int> v(26, 0);
        for(int right=0; right<s.length(); right++) {
            v[s[right] - 'A']++;
            maxfreq = max(maxfreq, v[s[right] - 'A']);
            if (right - left + 1 - maxfreq > k) {
                v[s[left] - 'A']--;
                left++;
            }
            ans = max(ans, right - left + 1);
        }
        return ans;
    }
};
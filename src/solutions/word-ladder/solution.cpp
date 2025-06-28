class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        set<string> wordSet(wordList.begin(), wordList.end());
        if (!wordSet.count(endWord)) {
            return 0;
        }
        queue<string> q;
        q.push(beginWord);
        int steps = 0;
        while(!q.empty()) {
            int qs = q.size();
            for(int i=0; i<qs; i++) {
                string s = q.front();
                q.pop();
                if (s == endWord) return steps+1;
                for(int j=0; j<s.length(); j++) {
                    char orig = s[j];
                    for(char k='a'; k<='z'; k++) {
                        s[j] = k;
                        if (wordSet.count(s)) {
                            q.push(s);
                            wordSet.erase(s);
                        }
                    }
                    s[j] = orig;
                }
            }
            steps++;
        }
        return 0;
    }
};
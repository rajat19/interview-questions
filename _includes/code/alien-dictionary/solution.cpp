class Solution {
public:
    string alienOrder(vector<string>& A) {
        unordered_map<int, unordered_set<int>> G;
        int indegree[26] = {};
        for (auto &s : A) {
            for (char c : s) G[c - 'a'] = {};
        }
        for (int i = 1; i < A.size(); ++i) {
            int j = 0;
            for (; j < min(A[i - 1].size(), A[i].size()); ++j) {
                if (A[i - 1][j] == A[i][j]) continue;
                G[A[i - 1][j] - 'a'].insert(A[i][j] - 'a');
                break;
            }
            if (j == A[i].size() && j < A[i - 1].size()) return "";
        }
        for (auto &[from, tos] : G) {
            for (int to : tos) {
                indegree[to]++;
            }
        }
        queue<int> q;
        for (int i = 0; i < 26; ++i) {
            if (G.count(i) && indegree[i] == 0) q.push(i);
        }
        string ans;
        while (q.size()) {
            int u = q.front();
            q.pop();
            ans += u + 'a';
            for (int v : G[u]) {
                if (--indegree[v] == 0) q.push(v);
            }
        }
        return ans.size() == G.size() ? ans : "";
    }
};
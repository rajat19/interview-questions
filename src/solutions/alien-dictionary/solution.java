class Solution {
    // Returns the order of characters in the alien language, or "" if invalid
    public String alienOrder(String[] words) {
        // Adjacency matrix for graph representation
        boolean[][] g = new boolean[26][26];
        // Set of present characters
        boolean[] s = new boolean[26];
        int cnt = 0;
        int n = words.length;
        // Mark all unique characters and build graph edges
        for (int i = 0; i < n - 1; ++i) {
            for (char c : words[i].toCharArray()) {
                if (cnt == 26) break;
                c -= 'a';
                if (!s[c]) {
                    ++cnt;
                    s[c] = true;
                }
            }
            int m = words[i].length();
            for (int j = 0; j < m; ++j) {
                if (j >= words[i + 1].length()) return ""; // prefix case
                char c1 = words[i].charAt(j), c2 = words[i + 1].charAt(j);
                if (c1 == c2) continue;
                if (g[c2 - 'a'][c1 - 'a']) return ""; // cycle check
                g[c1 - 'a'][c2 - 'a'] = true;
                break;
            }
        }
        // Mark unique characters in the last word
        for (char c : words[n - 1].toCharArray()) {
            if (cnt == 26) break;
            c -= 'a';
            if (!s[c]) {
                ++cnt;
                s[c] = true;
            }
        }
        // Calculate indegrees
        int[] indegree = new int[26];
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < 26; ++j) {
                if (i != j && s[i] && s[j] && g[i][j]) {
                    ++indegree[j];
                }
            }
        }
        // Topological sort using Kahn's algorithm
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; ++i) {
            if (s[i] && indegree[i] == 0) {
                q.offerLast(i);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!q.isEmpty()) {
            int t = q.pollFirst();
            ans.append((char) (t + 'a'));
            for (int i = 0; i < 26; ++i) {
                if (i != t && s[i] && g[t][i]) {
                    if (--indegree[i] == 0) {
                        q.offerLast(i);
                    }
                }
            }
        }
        // If not all characters are used, return ""
        return ans.length() < cnt ? "" : ans.toString();
    }
}
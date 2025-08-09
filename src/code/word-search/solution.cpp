class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        int n = board.size(), m = board[0].size();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if (exist(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    bool exist(vector<vector<char>> &board, string word, int x, int y, int w) {
        if (w == word.length()) return true;
        if (x < 0 || y < 0 || x == board.size() || y == board[0].size()) return false;
        if (board[x][y] != word[w]) return false;
        char c = board[x][y];
        board[x][y] = '*';
        bool res = exist(board, word, x+1, y, w+1)
            || exist(board, word, x, y+1, w+1)
            || exist(board, word, x-1, y, w+1)
            || exist(board, word, x, y-1, w+1);
        board[x][y] = c;
        return res;
    }
};
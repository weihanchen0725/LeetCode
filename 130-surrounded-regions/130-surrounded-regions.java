class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'O' && (i == 0 || i == m - 1 || j == 0 || j == n - 1)) {
                    
                        dfs(board, i, j);
                    
                }
            }
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] != 'Z') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'Z') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    private void dfs(char[][] board, int i, int j) {
        // if (i + 1 > m || i - 1 < 0 || j + 1 > n || j - 1 < 0 || board[i][j] != 'O') {
        //     return;
        // }
        // board[i][j] = 'Z';
        // dfs(board, i + 1, j, m, n);
        // dfs(board, i - 1, j, m, n);
        // dfs(board, i, j + 1, m, n);
        // dfs(board, i, j - 1, m, n);
        board[i][j] = 'Z';
        
        
        if (i + 1 < board.length && board[i + 1][j] == 'O') {
            dfs(board, i + 1, j);
        }
        if (i - 1 >= 0 && board[i - 1][j] == 'O') {
            dfs(board, i - 1, j);
        }
        if (j + 1 < board[0].length && board[i][j + 1] == 'O') {
            dfs(board, i, j + 1);
        }
        if (j - 1 >= 0 && board[i][j - 1] == 'O') {
            dfs(board, i, j - 1);
        }
    }
}
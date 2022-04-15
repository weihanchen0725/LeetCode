class Solution {
    private static final int[][] DIRS = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
    private static final char NON_CAPTURED = '#';

    public void solve(char[][] board) {
        if (board == null) {
            throw new IllegalArgumentException("Input board is null");
        }
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfsHelper(board, i, 0);
            }

            if (board[i][n - 1] == 'O') {
                dfsHelper(board, i, n - 1);
            }
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') {
                dfsHelper(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                dfsHelper(board, m - 1, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = (board[i][j] == NON_CAPTURED) ? 'O' : 'X';
            }
        }
    }

    private void dfsHelper(char[][] board, int x, int y) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != 'O') {
            return;
        }
        board[x][y] = NON_CAPTURED;
        for (int[] d : DIRS) {
            dfsHelper(board, x + d[0], y + d[1]);
        }
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // validate row / column
        for (int i = 0; i < 9; i++) {
            int[] rowFlags = new int[10];
            int[] colFlags = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowFlags[board[i][j]-'0'] == 1) {
                        return false;
                    } else {
                        rowFlags[board[i][j]-'0'] = 1;
                    }
                }
                
                if (board[j][i] != '.') {
                    if (colFlags[board[j][i]-'0'] == 1) {
                        return false;
                    } else {
                        colFlags[board[j][i]-'0'] = 1;
                    }
                }
            }
        }
        
        // validate subbox
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean res = checkSubBox(i, j, board);
                if (!res) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean checkSubBox(int i, int j, char[][]board) {
        int[] flag = new int[10];
        
        for (int m = i*3; m < (i+1)*3; m++) {
            for (int n = j*3; n < (j+1)*3; n++) {
                if (board[m][n] != '.') {
                    if (flag[board[m][n]-'0'] == 1) {
                        return false;
                    }
                    flag[board[m][n]-'0'] = 1;
                }
            }    
        }
        return true;
    }
}
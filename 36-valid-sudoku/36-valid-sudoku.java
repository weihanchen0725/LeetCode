class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            int[] rowFlags = new int[10];
            int[] columnFlags = new int[10];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(rowFlags[board[i][j]-'0'] == 1) return false;
                    else rowFlags[board[i][j]-'0'] = 1;
                }
                if(board[j][i] != '.'){
                    if(columnFlags[board[j][i]-'0'] == 1) return false;
                    else columnFlags[board[j][i]-'0'] = 1;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boolean result = checkSubBoxes(i, j, board);
                if(!result) return false;
            }
        }
        return true;
    }
    public boolean checkSubBoxes(int i, int j, char[][] board){
        int[] flags = new int[10];
        for(int m = i*3; m < (i+1)*3; m++){
            for(int n = j*3; n < (j+1)*3; n++){
                if(board[m][n] != '.'){
                    if(flags[board[m][n]-'0'] == 1) return false;
                    else flags[board[m][n]-'0'] = 1;
                }
            }
        }
        return true;
    }
}
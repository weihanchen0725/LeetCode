class Solution {
    public boolean checkValid(int[][] matrix) {
        int length = matrix.length;
        for(int r = 0; r < length; r++){
            boolean[] rows = new boolean[length+1];
            boolean[] columns = new boolean[length+1];
            for(int c = 0; c < length; c++){
                if(rows[matrix[r][c]] || columns[matrix[c][r]]) return false;
                rows[matrix[r][c]] = true;
                columns[matrix[c][r]] = true;
            }
        }
        return true;
    }
}
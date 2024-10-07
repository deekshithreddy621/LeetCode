class Solution {
    public void setZeroes(int[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        boolean mat[][] = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    mat[i][j] = true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    if(mat[i][j])
                    setZero(matrix, i, j, rows, cols);
                }
            }
        }
    }
    public void setZero(int[][] matrix, int i, int j, int rows, int cols){
        for(int x=0; x<cols; x++){
            matrix[i][x] = 0;
        }
        for(int y=0; y<rows; y++){
            matrix[y][j] = 0;
        }
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0;j<cols;j++){
            for(int i=rows-1;i>=0;i--){
                list.add(matrix[i][j]);
            }
        }
        int idx = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = list.get(idx++);
            }
        }
    }
}
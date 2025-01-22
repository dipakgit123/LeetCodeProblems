class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int row = 0;
        int col  = matrix[0].length-1;

        while(row<n && col>=0){
            if(matrix[row][col]== target){
                return true;
            }else if(target< matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
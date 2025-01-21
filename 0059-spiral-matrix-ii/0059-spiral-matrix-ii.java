class Solution {
    public int[][] generateMatrix(int n) {

        int [][] ans = new int[n][n];
        
        // List<Integer> ans  = new ArrayList<>();

        int startRow =0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
         int num =1;

        while(startRow<=endRow && startCol<=endCol){

            for(int i= startCol;i<=endCol;i++){
                ans[startRow][i]=num++;
            }
            startRow++;

            for(int i = startRow; i<=endRow;i++){
                ans[i][endCol]=num++;
            }
            endCol--;


           for(int i=endCol;i>=startCol;i--){
            if(startRow<=endRow)
                 ans[endRow][i] = num++;
           }
           endRow--;


            for(int i= endRow ; i>=startRow; i--){
                if(startCol<=endCol)
                ans[i][startCol]  = num++;
            }
             startCol++;

        }
        return ans;
    }

}
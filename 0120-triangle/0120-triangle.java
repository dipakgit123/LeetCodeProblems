class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
           int n = triangle.size();
        int[] prev = new int[n];
        for(int j = 0; j < n; j++){
            prev[j] = triangle.get(n - 1).get(j);
        }
        for(int i = n - 2; i >= 0; i--){
            int[] curr = new int[n];
            for(int j = i; j >= 0; j--){
                int down = triangle.get(i).get(j) + prev[j];
                int diag = triangle.get(i).get(j) + prev[j + 1];
                curr[j] = Math.min(down, diag);
            }
            prev = curr;
        }
        return prev[0];
    }
}

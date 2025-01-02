class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int sum = n*(n+1)/2;

        int totalSum =0;

        for(int i =0 ; i<n;i++){

            totalSum = totalSum + nums[i];
        }


               return sum - totalSum;

    }
}
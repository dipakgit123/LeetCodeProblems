class Solution {
    public int findMin(int[] nums) {

        int MinValue =  Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){

             if(nums[i]<MinValue){
                MinValue = nums[i];
             }

        }
        return MinValue;
    }
}
class Solution {
    public int findPeakElement(int[] nums) {

        int maxElement = nums[0];
        int maxIndex  = 0;

        for(int i =0; i<nums.length;i++){
            if(maxElement<nums[i]){
                maxElement = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
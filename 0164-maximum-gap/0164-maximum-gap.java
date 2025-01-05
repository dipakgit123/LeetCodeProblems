class Solution {
    public int maximumGap(int[] nums) {
        
     if (nums == null || nums.length < 2) {
            return 0; // Not enough elements to calculate a gap
        }

        Arrays.sort(nums);

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }

        return maxGap;

        
    }
}
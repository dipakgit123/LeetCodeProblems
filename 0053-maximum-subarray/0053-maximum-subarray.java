class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;  // Initialize maxSum to the smallest integer
        int largestNegative = Integer.MIN_VALUE;  // To track the largest (least negative) 
        boolean allNegative = true;  // A flag to check if all numbers are negative

   for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                allNegative = false;  // If there's any positive number, change the flag
            }

            // Track the largest negative number
            if (nums[i] > largestNegative) {
                largestNegative = nums[i];
            }

            // Standard Kadane's logic
            currSum = currSum + nums[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        // If all numbers are negative, return the largest (least negative) number
        if (allNegative) {
            maxSum = largestNegative;
        }

        return maxSum;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {

         int n = nums.length;
        int lastNonZeroFoundAt = 0;

        // Loop through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap the current element with the element at lastNonZeroFoundAt
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }
        
    }

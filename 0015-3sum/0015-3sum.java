
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to easily skip duplicates
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;  // Left pointer
            int right = nums.length - 1;  // Right pointer
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a triplet, add it to the answer list
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move the pointers after adding the triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to the right
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to the left
                    right--;
                }
            }
        }
        
        return ans;
    }
}

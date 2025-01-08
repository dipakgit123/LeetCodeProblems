class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int newArr[] = new int[n];
        
        // Initialize the first element of newArr
        newArr[0] = 1;
        
        // Construct the prefix product array
        for (int i = 1; i < n; i++) {
            newArr[i] = newArr[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // Construct the suffix product array and merge it with the prefix product array
        for (int i = n - 1; i >= 0; i--) {
            newArr[i] *= suffix;
            suffix *= nums[i];
        }

        return newArr;
    }
}

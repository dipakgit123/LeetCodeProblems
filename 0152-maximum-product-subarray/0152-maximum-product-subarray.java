class Solution {
    public int maxProduct(int[] nums) {
        
            int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        
        // Forward pass
        for (int i = 0; i < n; i++) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) product = 1; // reset product to 1 if it becomes 0
        }
        
        product = 1;
        // Backward pass
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) product = 1; // reset product to 1 if it becomes 0
        }

        return maxProduct;
        
    }
}
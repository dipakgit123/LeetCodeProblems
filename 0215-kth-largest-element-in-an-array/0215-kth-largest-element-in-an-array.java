class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int largest = 0;
        int n = nums.length;

        for(int i=nums.length-1; i>=0 ;i--){
           
          largest = nums[n-k];

        }
    return largest;
    }
}
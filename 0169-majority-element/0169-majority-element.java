class Solution {
    public int majorityElement(int[] nums) {
 
          return majorityEle(nums, 0, nums.length-1);
       
    }

    public static int countRange(int[] nums, int num, int lo, int hi){
        int count = 0;

        for(int i=lo ; i<=hi;i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityEle(int [] nums, int lo, int hi ){

        if(lo==hi){
            return nums[lo];
        }

        int mid = (hi-lo)/2+lo;

        int left = majorityEle(nums, lo, mid);
        int right = majorityEle(nums,mid+1, hi);

        if(left==right){
            return left;
        }

        int leftCount = countRange(nums, left, lo,hi);
        int rightCount = countRange(nums, right, lo, hi);

        return leftCount>rightCount ? left:right;
    }
}
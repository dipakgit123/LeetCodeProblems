class Solution {
    public int singleNumber(int[] nums) {
        
        int count = 0;
        int single = 0;
        for(int i =0 ; i<nums.length;i++ ){
            count = 0;
          for(int j =0; j<nums.length;j++){
            if(nums[i] == nums[j]){
                count++;
            }
          }
           if(count!=3){
            single = nums[i];
        }
        }

       

   return single;
    }
}
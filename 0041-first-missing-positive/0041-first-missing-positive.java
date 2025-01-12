class Solution {
    public int firstMissingPositive(int[] nums) {
         int i=0;
        int l = nums.length;
        while(i < l){
            int correct = nums[i];
            if (correct < l && correct > 0 && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=1;j<l;j++){
            if(nums[j] != j){
                return j;
            }
        }
        if(nums[0] > 0 && nums[0] == l){
            return l+1;
        }
        return l;


    }
}
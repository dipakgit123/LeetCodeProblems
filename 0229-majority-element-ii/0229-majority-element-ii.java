class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int majorEle = nums.length/3;
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            int count = 0;
            for(int j=0; j<nums.length;j++){
                if(nums[j]==nums[i]){
                   count = count+1;
                }
            }
           if (count > majorEle && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
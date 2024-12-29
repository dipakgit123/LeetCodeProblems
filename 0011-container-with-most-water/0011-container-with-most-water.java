class Solution {
    public int maxArea(int[] height) {

       int n = height.length;
       int leftB = 0;
       int rightB = n-1;
        int Maxwater = 0;
        
        while(leftB<rightB){

            int width = rightB-leftB;
            int ht = Math.min(height[rightB], height[leftB]);

            int currentWater = ht * width;
            Maxwater =  Math.max(Maxwater,currentWater);
         
         if(height[leftB]<height[rightB]){
            leftB++;
         }else{
            rightB--;
         }

        }
     return Maxwater;
    }
}
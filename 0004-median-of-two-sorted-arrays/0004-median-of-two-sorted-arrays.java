class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
  int a = nums1.length;
  int b = nums2.length;

  int c1 = a+b;

  int c[] = new int[c1];

    for (int i = 0; i < a; i = i + 1) {
            c[i] = nums1[i];
        }

        for (int i = 0; i < b; i = i + 1) {
            c[a + i] = nums2[i];
        }
            Arrays.sort(c);

         int len = c.length;
         double median = 0;
           
           if(len %2 == 0){
            median = (c[len/2-1]+c[len/2])/2.0;
           }else{
            median = c[len/2];
           }

            return median;
    }
}
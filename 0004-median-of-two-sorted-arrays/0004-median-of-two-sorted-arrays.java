class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 int a = nums1.length;
        int b = nums2.length;
        int[] c = new int[a + b];

        // Combine the two arrays
        for (int i = 0; i < a; i++) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b; i++) {
            c[a + i] = nums2[i];
        }

        // Sort the combined array
        Arrays.sort(c);

        // Calculate the median
        int len = c.length;
        if (len % 2 == 0) {
            return (c[len / 2 - 1] + c[len / 2]) / 2.0;
        } else {
            return c[len / 2];
        }
    }
}
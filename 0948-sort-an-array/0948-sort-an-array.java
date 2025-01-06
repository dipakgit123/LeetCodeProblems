class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // If there's 1 or fewer elements, it's already sorted, so return the array
        if (n < 2) return nums;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        // Copy the elements into left and right subarrays
        for (int i = 0; i < mid; i++) 
            l[i] = nums[i];
        for (int i = mid; i < n; i++) 
            r[i - mid] = nums[i];

        // Recursively sort the left and right subarrays
        sortArray(l);  // Pass only the left subarray
        sortArray(r);  // Pass only the right subarray

        // Merge the sorted subarrays back into the original array
        merge(nums, l, r, mid, n - mid);
        
        return nums;
    }

    public void merge(int[] nums, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        // Merge the two sorted subarrays
        while (i < left && j < right) {
            if (l[i] <= r[j])
                nums[k++] = l[i++];
            else
                nums[k++] = r[j++];
        }

        // If any elements remain in the left subarray, add them
        while (i < left)
            nums[k++] = l[i++];

        // If any elements remain in the right subarray, add them
        while (j < right)
            nums[k++] = r[j++];
    }
}

class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                count++;
            }
        }
        return count;
    }
}
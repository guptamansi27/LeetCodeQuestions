class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        // If array has 2 or less elements, no need to remove anything
        if (n <= 2) return n;

        int i = 2; // position to place next valid element

        for (int j = 2; j < n; j++) {
            // Check if current element is different from element at i-2
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // new length
    }
}
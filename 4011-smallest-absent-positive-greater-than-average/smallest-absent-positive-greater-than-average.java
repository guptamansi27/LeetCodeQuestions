class Solution {
    public int smallestAbsent(int[] nums) {
       int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int avg = sum / nums.length;

        int x = Math.max(1, avg + 1);

        while (true) {
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }
            x++;
        }
    }
}
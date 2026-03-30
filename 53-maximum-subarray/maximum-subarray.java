class Solution {
    public int maxSubArray(int[] nums) {
        /*this code exceeds time
        int n = nums.length;
        int sum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;*/
        int n=nums.length;
        int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }
}
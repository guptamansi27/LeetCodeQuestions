class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*Method 1:Don't pass all test case
        int n = numbers.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                }
            }
        }
        return arr;*/
        //Method 2 :Two pointer Method
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target)
                return new int[]{left+1,right+1};
            else if(sum<target)
                left++;
            else
                right--;
        }
        return new int[]{-1,-1};
    }
}
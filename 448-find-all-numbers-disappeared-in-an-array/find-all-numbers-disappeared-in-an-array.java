class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            //Remove duplicates
            while(j+1<n && nums[j]==nums[j+1])
                j++;
            if(j<n && nums[j]==i)
                j++;
            else
                l.add(i);
       }
        return l;
    }
}
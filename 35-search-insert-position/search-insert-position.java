class Solution {
    public int searchInsert(int[] num, int target) {
        boolean isFound=false;
        int l=0,mid=0;
        int u = num.length-1;
        while(l<=u){
            mid=(u+l)/2;
            if(num[mid]==target)
                return mid;
            else if(num[mid]>target)
                u=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}
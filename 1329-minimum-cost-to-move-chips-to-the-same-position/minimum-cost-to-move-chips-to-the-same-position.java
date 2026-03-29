class Solution {
    public int minCostToMoveChips(int[] position) {
        /* Method 1: O(n^2)
        int minCost = Integer.MAX_VALUE;
        int l=position.length;
        for(int i=0;i<l;i++){
            int c=0;
            for(int j=0;j<l;j++){
                if(Math.abs(position[i]-position[j])%2!=0){
                    c+=1;
                }
            }
            minCost=Math.min(c,minCost);
        }
        return minCost;*/
    //Method 2 optimal O(n)
    int even=0,odd=0;
        for(int ele:position){
            if(ele%2==0) even++;
            else odd++;
        }
        return Math.min(even,odd);
    }
}
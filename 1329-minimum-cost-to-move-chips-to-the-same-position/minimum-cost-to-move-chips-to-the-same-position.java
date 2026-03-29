class Solution {
    public int minCostToMoveChips(int[] position) {
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
        return minCost;
    }
}
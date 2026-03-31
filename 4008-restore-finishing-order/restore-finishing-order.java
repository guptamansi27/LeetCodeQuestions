class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=0;
        for(int od:order){
            for(int fr:friends){
                if(od==fr)
                    n++;
            }
        }
    int k=0;
     int friendOrder[] = new int[n];
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j])
                    friendOrder[k++]=order[i];
            }
        }
        return friendOrder;
    }
}
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Step 1: Calculate sums
        int sumA=0,sumB=0;
        for(int a : aliceSizes) sumA+=a;
        for(int b : bobSizes) sumB+=b;

        // Step 2: Find difference    
        int diff=(sumA-sumB)/2;

         // Step 3: Store Bob's candies in HashSet
        Set<Integer> set=new HashSet<>();
        for(int b:bobSizes)
            set.add(b);

        // Step 4: Find valid pair
        for(int x:aliceSizes){
            int y=x-diff;
            if(set.contains(y))
                return new int[]{x,y};
        }
        return new int[]{-1,-1};
    }
}
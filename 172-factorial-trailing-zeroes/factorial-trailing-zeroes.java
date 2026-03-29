class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        for(int i=5;i<=n;i*=5){//i<=n loop until divisor is less than equal to dividend
            c +=n/i;
        }
        return c;
    }
}
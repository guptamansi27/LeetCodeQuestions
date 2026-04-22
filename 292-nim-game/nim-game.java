class Solution {
    public boolean canWinNim(int n) {
        /* Method 1
        if(n%4==0)
            return false;
        else
            return true;*/
        return n%4!=0;
    }
}
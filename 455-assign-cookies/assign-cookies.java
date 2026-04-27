//import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        // Step 1: Sort both arrays
        Arrays.sort(g);
        Arrays.sort(s);
        
        // Step 2: Initialize pointers
        int i = 0; // child
        int j = 0; // cookie
        int count = 0;
        
        // Step 3: Match cookies to children
        while (i < g.length && j < s.length) {
            
            if (s[j] >= g[i]) {
                count++;   // child satisfied
                i++;       // move to next child
                j++;       // move to next cookie
            } else {
                j++;       // try bigger cookie
            }
        }
        
        return count;
    }
}
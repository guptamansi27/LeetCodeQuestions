class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) return false;
        /* Method 1: T.C->O(nlogn)  S.C->O(n) 
        This is not optimal dur to sorting

        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);*/
        //Method 2: Optimal  T.C->O(n)  S.C->O(1)

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // increment for s
            count[t.charAt(i) - 'a']--;  // decrement for t
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
            
  
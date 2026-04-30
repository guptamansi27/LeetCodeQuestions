import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Integer, Integer> mapST = new HashMap<>();
        HashMap<Integer, Integer> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int c1 = s.charAt(i);
            int c2 = t.charAt(i);

            // s -> t
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            // t -> s
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
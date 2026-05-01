class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] st = s.split(" ");
        if(pattern.length()!=st.length) return false;
        HashMap<Character,String> wc = new HashMap<>();//wordsToChar
        HashMap<String,Character> cw = new HashMap<>();//charToWords

        for(int i=0;i<st.length;i++){
           
            char c1 = pattern.charAt(i);
            String c2 = st[i];

            if(wc.containsKey(c1)){
                if(!wc.get(c1).equals(c2)) return false;
            }
            else{
                wc.put(c1,c2);
            }

            if(cw.containsKey(c2)){
                if(!cw.get(c2).equals(c1)) return false;
            }
            else{
                cw.put(c2,c1);
            }
        }
        return true;
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String word:words){
            boolean isValid=true;
            for(char ch:word.toCharArray()){
                if(!set.contains(ch)){
                    isValid=false;
                    break;
                }
            }
            if(isValid) count++;
        }
        return count;
    }
}
class Solution {
    public int scoreOfString(String s) {
        //char[] st = s.toCharArray();
        /*int sum=0;
        int[] arr= new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<arr.length-1;i++){
            sum=sum+Math.abs(arr[i+1]-arr[i]);
        }
        return sum;*/
        int sum = 0;

        for(int i = 0; i < s.length() - 1; i++){
            sum += Math.abs(s.charAt(i+1) - s.charAt(i));
        }

        return sum;
    }
}
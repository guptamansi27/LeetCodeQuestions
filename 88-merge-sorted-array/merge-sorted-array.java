class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int len = num1.length;
        for(int i=0;i<n;i++){
            num1[m]=num2[i];
            m++;
        }
        //method1 - Using Predefined function
       // Arrays.sort(num1);
        //method1 - brute force method
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(num1[i]>num1[j]){
                    int temp=num1[i];
                    num1[i]=num1[j];
                    num1[j]=temp;
                }
            }
        }
    }
}
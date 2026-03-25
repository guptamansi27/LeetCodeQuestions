/*class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0,num2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0)
                num1+=i;
            else
                num2+=i;
        }
        return num1-num2;
    }
}*/
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=n*(n+1)/2;//sum of all numbers

        int k=n/m; //count of multiples
        int num2 = m *k*(k+1)/2;//sum of multiples

        int num1=sum-num2;//non-multiples sum

        return num1-num2;
    }
}

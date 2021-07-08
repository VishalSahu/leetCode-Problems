class Solution {
    public int climbStairs(int n) {
        int a=1,b=2;
        int sum=0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        for(int i=0;i<n-2;i++)
        {
            sum = a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}

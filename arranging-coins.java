class Solution {
    public int arrangeCoins(int n) {
        int stairs = 0;
        while(n>0)
        {
            stairs++;
            n = n-stairs;
        }
        if(n==0)
            return stairs;
        else
            return stairs-1;
    }
}

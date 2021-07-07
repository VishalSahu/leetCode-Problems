class Solution {
    public int minOperations(int n) {
        int x = 1;
        int y = 2*(n-1)+1;
        int num = (x+y)/2;
        int times = 0;
        for(int i=0;i<(n/2);i++)
        {
            times = times + (num-(2*(i)+1));
        }
        return times;
    }
}

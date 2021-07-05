class Solution {
    public boolean isPerfectSquare(int num) {
        long start=0,end=num;
        if(num * num == num)
        {
            return true;
        }
        while(start+1<end)
        {
            long mid = start + (end-start)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid<num)
            {
                start = mid;
            }
            else
            {
                end=mid;
            }
        }
        return false;
    }
}

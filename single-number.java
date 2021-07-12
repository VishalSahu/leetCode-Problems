class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            int a = nums[i];
            int tmp = 0;
            for(int j=0;j<len;j++)
            {
                if(a==nums[j])
                {
                    tmp++;
                }
            }
            if(tmp==1)
            {
                return a;
            }
        }
        return 0;
    }
}

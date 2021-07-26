class Solution {
    public int balancedStringSplit(String s) {
        int countr = 0;
        int countl = 0;
        int total = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                countr++;
            }
            else
            {
                countl++;
            }
            if(countr == countl)
            {
                total++;
            }
        }
        return total;
    }
}

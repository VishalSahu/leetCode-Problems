class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        int z=0;
        if(s.length()==t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if(str1[i]==str2[i])
                {
                    z++;
                }
            }
        }
        if(z==s.length())
           return true;
        return false;
    }
}

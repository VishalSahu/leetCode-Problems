class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            str.append(s.charAt(i));
            if(str.length()>=part.length())
            {
                if(str.substring(str.length()-part.length()).equals(part))
                {
                    str.setLength(str.length()-part.length());
                }
            }
        }
        return str.toString();
    }
}

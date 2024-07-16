class Solution {
    public void reverseString(char[] s) {
        char[] str=new char[s.length];
        for(int i=0;i<s.length;i++)
        {
            str[i]=s[s.length-i-1];
        }
        for(int i=0;i<str.length;i++)
        {
            s[i]=str[i];
        }
    }
}
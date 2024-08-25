class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small=new int[26];
        int[] big=new int[26];
        for(char ch:word.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                small[ch-'a']++;
            }
            else
            {
                big[ch-'A']++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(small[i]!=0 && big[i]!=0)
            {
                count++;
            }
        }
        return count;
    }
}
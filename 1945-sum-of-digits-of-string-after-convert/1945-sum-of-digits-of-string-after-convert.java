class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            sb.append((int) (ch-'a'+1));
        }
        int ans=0;
        for(int i=0;i<k;i++)
        {
            ans=0;
            for(char ch:sb.toString().toCharArray())
            {
                ans+=Character.getNumericValue(ch);
            }
            sb=new StringBuilder(Integer.toString(ans));
        }
        return ans;
    }
}
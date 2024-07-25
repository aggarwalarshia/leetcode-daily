class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxLen=0;
        int maxFreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length())
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,map.get(s.charAt(r)));

            while((r-l+1)-maxFreq>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            if((r-l+1)-maxFreq<=k)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
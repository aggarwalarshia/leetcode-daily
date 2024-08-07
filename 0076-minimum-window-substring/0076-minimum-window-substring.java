class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null ||s.length() < t.length())
        {
            return "";
        }
        int l=0;
        int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int startIndex=-1;
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r)))
            {
                map.put(s.charAt(r),map.get(s.charAt(r))-1);
                if(map.get(s.charAt(r))>=0)
                {
                    count++;
                }
            }
            while(count==t.length())
            {
                if(r-l+1 <minLen)
                {
                    minLen=r-l+1;
                    startIndex=l;
                }
                if(map.containsKey(s.charAt(l)))
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))+1);
                    if(map.get(s.charAt(l))>0)
                    {
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        return startIndex==-1 ? "" : s.substring(startIndex,startIndex+minLen);
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr=new String(charArr);
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
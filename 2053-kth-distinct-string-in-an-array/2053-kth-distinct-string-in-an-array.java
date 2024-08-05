class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:arr)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();
        for(String str:arr)
        {
            if(map.get(str)==1 && !list.contains(str))
            {
                list.add(str);
            }
        }
        if(k<=list.size())
        {
            return list.get(k-1);
        }
        return "";
    }
}
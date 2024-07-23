class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list =new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->
        map.get(a)==map.get(b) ? b-a : map.get(a) - map.get(b));

        int index=0;
        for(int num:list)
        {
            for(int i=0;i<map.get(num);i++)
            {
                nums[index++]=num;
            }
        }
        return nums;
    }
}
class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int maxStreak=-1;
        for(int num:nums)
        {
            int root = (int) Math.sqrt(num);
            if(root*root == num && map.containsKey(root))
            {
                map.put(num,map.get(root)+1);
            }
            else
            {
                map.put(num,1);
            }
            maxStreak=Math.max(maxStreak,map.get(num));
        }
        if(maxStreak==1) return -1;
        else return maxStreak;
    }
}
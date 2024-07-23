class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int index=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
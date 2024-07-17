class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                count=1;
                val=nums[i];
            }
            else if(nums[i]==val)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val) count1++;
            
            if(count1>(nums.length/2)) return val;
        }
        return -1;
    }
}
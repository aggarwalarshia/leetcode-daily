class Solution {
    public int minOperations(int[] nums) {
        int flipCount=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(flipCount%2==1) nums[i]=1-nums[i];

            if(nums[i]==0) flipCount++;
        }
        return flipCount;
    }
}
class Solution {
    public int lowerBound(int[] nums,int n,int x)
    {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums,int n,int x)
    {
        int low=0;
        int high=nums.length-1;
        int ans=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb= lowerBound(nums,nums.length,target);
        if(lb==nums.length || nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,nums.length,target)-1};
    }
}
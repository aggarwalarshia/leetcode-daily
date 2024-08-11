class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int[] ans={-1,-1};
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
                if(nums[mid]==target)
                {
                    ans[0]=mid;
                }
            }
            else
            {
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)
            {
                low=mid+1;
                if(nums[mid]==target)
                {
                    ans[1]=mid;
                }
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
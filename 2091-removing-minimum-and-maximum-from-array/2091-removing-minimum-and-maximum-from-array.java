class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int minIndex=0;
        int maxIndex=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
        }
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);
        int removeLeft=right+1;
        int removeRight=n-left;
        int removeBoth=left+1+n-right;

        return Math.min(removeLeft,Math.min(removeRight,removeBoth));
    }
}
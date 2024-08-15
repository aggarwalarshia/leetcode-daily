class Solution {
    public int func(int[] weights,int capacity)
    {
        int n=weights.length;
        int days=1;
        int load=0;
        for(int i=0;i<n;i++)
        {
            if(load+weights[i] > capacity)
            {
                days+=1;
                load=weights[i];
            }
            else
            {
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0;
        int sum=0;
        for(int i:weights)
        {
            max=Math.max(max,i);
            sum+=i;
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int daysRequired=func(weights,mid);
            if(daysRequired<=days)
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
}
class Solution {
    public boolean possible(int[] bloomDay,int day,int m,int k)
    {
        int n=bloomDay.length;
        int count=0;
        int bouq=0;
        for(int i=0;i<n;i++)
        {
            if(bloomDay[i]<=day)
            {
                count++;
                if(count==k)
                {
                    bouq++;
                    count=0;
                }
            }
            else
            {
                count=0;
            }
        }
        bouq+=(count/k);
        return bouq>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k > n) return -1;
        int min=0;
        int max=0;
        for(int day:bloomDay)
        {
            min=Math.min(min,day);
            max=Math.max(max,day);
        }
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k))
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
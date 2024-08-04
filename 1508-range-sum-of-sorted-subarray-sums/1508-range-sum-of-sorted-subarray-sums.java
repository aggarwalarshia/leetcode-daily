class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long mod=1000000007;
        long[] arr=new long[n*(n+1)/2];
        int k=0;
        for(int i=0;i<n;i++)
        {
            long sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                arr[k++]=sum;
            }
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=left-1;i<right;i++)
        {
            ans=(ans+arr[i])%mod;
        }
        return (int) ans;
    }
}
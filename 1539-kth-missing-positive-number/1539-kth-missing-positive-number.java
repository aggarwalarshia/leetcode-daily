class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((arr[mid]-(mid+1))>=k) high=mid-1;
            else low=mid+1;
        }
        return high+1+k;
    }
}
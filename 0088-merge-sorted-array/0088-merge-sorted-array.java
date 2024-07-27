class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            ans[i]=nums1[i];
            count++;
        }
        for(int i=0;i<n;i++)
        {
            ans[count++]=nums2[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++)
        {
            nums1[i]=ans[i];
        }
    }
}
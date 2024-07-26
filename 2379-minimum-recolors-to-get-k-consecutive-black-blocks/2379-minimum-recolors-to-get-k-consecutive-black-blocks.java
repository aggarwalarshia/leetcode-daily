class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=0;
        int n=blocks.length();
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W') ans++;
        }
        int min=ans;
        int l=0;
        int r=k;
        while(r<n)
        {
            if(blocks.charAt(l)=='W') ans--;
            if(blocks.charAt(r)=='W') ans++;
            if(ans==0) return 0;
            min=Math.min(min,ans);
            l++;
            r++;
        }
        return min;
    }
}
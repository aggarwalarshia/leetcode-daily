class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int[][] res=new int[n][m];
        int r=0;
        int c=0;
        while(r<n && c<m)
        {
            int minVal=Math.min(rowSum[r],colSum[c]);
            res[r][c]=minVal;
            rowSum[r]-=minVal;
            colSum[c]-=minVal;

            if(rowSum[r]==0)
            {
                r++;
            }
            else
            {
                c++;
            }
        }
        return res;
    }
}
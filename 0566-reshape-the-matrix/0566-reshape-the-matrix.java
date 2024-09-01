class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;

        if((rows*cols) != (r*c)) return mat;

        int[][] res=new int[r][c];
        int res_rows=0;
        int res_cols=0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                res[res_rows][res_cols]=mat[i][j];
                res_cols++;

                if(res_cols==c)
                {
                    res_cols=0;
                    res_rows++;
                }
            }
        }
        return res;
    }
}
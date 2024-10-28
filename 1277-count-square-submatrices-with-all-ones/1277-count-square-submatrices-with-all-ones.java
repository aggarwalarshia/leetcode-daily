class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length==0) return 0;
        int count=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    count++;
                    for(int size=1;size+i<matrix.length && size+j<matrix[i].length;size++)
                    {
                        if(check(matrix,i,j,size))
                        {
                            count++;
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
    public boolean check(int[][] matrix, int startRow, int startCol, int size)
    {
        int endRow= startRow + size;
        int endCol= startCol + size;

        for(int i=startRow;i<=endRow;i++)
        {
            if(matrix[i][endCol]==0)
            {
                return false;
            }
        }
        for(int i=startCol;i<=endCol;i++)
        {
            if(matrix[endRow][i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
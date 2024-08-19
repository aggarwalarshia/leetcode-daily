class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNums=new int[n];
        uglyNums[0]=1;
        int index2=0; int index3=0; int index5=0;
        int next2=2; int next3=3; int next5=5;
        for(int i=1;i<n;i++)
        {
            int nextUgly=Math.min(next2,Math.min(next3,next5));
            uglyNums[i]=nextUgly;

            if(nextUgly==next2)
            {
                index2++;
                next2=uglyNums[index2]*2;
            }
            if(nextUgly==next3)
            {
                index3++;
                next3=uglyNums[index3]*3;
            }
            if(nextUgly==next5)
            {
                index5++;
                next5=uglyNums[index5]*5;
            }
        }
        return uglyNums[n-1];
    }
}
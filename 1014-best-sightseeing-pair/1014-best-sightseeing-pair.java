class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0;
        int maxOfI=values[0]+0;
        for(int j=1;j<values.length;j++)
        {
            max=Math.max(max,maxOfI+values[j]-j);
            maxOfI=Math.max(maxOfI,values[j]+j);
        }
        return max;
    }
}
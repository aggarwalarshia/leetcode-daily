class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0) return new int[0][];

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged=new ArrayList<>();

        for(int[] interval:intervals)
        {
            if(merged.isEmpty())
            {
                merged.add(interval);
            }
            else
            {
                int[] lastInterval=merged.get(merged.size()-1);
                if(lastInterval[1]>=interval[0])
                {
                    lastInterval[1]=Math.max(lastInterval[1],interval[1]);
                }
                else
                {
                    merged.add(interval);
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
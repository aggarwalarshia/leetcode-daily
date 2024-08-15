class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        int j=1;
        int missingCount=0;
        while(missingCount<k)
        {
            if(!set.contains(j))
            {
                missingCount++;
                if(missingCount==k)
                {
                    return j;
                }
            }
            j++;
        }
        return -1;
    }
}
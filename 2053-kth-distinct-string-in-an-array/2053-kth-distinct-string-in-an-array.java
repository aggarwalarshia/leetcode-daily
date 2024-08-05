class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> distinct=new HashSet<>();
        HashSet<String> duplicate=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(distinct.contains(arr[i]))
            {
                duplicate.add(arr[i]);
            }
            distinct.add(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!duplicate.contains(arr[i]))
            {
                count++;
                if(count==k) return arr[i];
            }
        }
        return "";
    }
}
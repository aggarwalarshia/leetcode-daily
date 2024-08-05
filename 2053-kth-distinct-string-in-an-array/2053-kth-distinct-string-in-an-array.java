class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            boolean isDistinct=true;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i].equals(arr[j]))
                {
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct)
            {
                list.add(arr[i]);
            }
        }
        if(k>list.size())
        {
            return "";
        }
        return list.get(k-1);
    }
}
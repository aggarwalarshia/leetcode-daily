class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size=s1.length();
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<=s2.length()-size;i++)
        {
            String s=s2.substring(i,i+size);
            char[] arr2=s.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
        }
        return false;
    }
}
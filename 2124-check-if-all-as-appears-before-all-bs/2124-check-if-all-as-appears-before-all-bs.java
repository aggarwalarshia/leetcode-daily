class Solution {
    public boolean checkString(String s) {
        String str="ba";
        for(int i=0;i<s.length();i++)
        {
            if(s.contains(str))
            {
                return false;
            }
        }
        return true;
    }
}
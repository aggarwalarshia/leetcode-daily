class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
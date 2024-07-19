class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0)
        {
            int remainder=(columnNumber-1)%26;
            sb.append((char)(remainder+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return sb.reverse().toString();
    }
}
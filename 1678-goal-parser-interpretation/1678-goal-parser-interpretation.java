class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        sb.append(command.replace("()","o"));
        String str=sb.toString();
        StringBuilder ssb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)==')')
            {
                continue;
            }
            ssb.append(str.charAt(i));
        }
        return ssb.toString();
    }
}
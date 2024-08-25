class Solution {
    public String capitalizeTitle(String title) {
        String[] arr=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String str: arr)
        {
            if(str.length()<=2) sb.append(str.toLowerCase());

            else
            {
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
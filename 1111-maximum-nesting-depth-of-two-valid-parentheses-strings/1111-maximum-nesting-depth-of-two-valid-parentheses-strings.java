class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count=0;
        int[] arr=new int[seq.length()];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<seq.length();i++)
        {
            if(seq.charAt(i)==')' && !stack.isEmpty())
            {
                if(stack.peek()=='(')
                {
                    stack.pop();
                    arr[i]=stack.size()%2;
                }
            }
            else
            {
                arr[i]=stack.size()%2;
                stack.push(seq.charAt(i));
            }
        }
        return arr;
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*(n-1);i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
            {
                stack.pop();
            }
            if(i<n)
            {
                if(!stack.isEmpty()) arr[i]=stack.peek();
                else arr[i]=-1;
            }
            stack.push(nums[i%n]);
        }
        return arr;
    }
}
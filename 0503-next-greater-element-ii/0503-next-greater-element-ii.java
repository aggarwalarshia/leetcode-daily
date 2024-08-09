class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i%n]=-1;
                stack.push(nums[i%n]);
            }
            if(stack.peek()>nums[i%n])
            {
                ans[i%n]=stack.peek();
                stack.push(nums[i%n]);
            }
        }

        return ans;
    }
}
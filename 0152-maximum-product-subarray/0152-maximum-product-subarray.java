class Solution {
    public int maxProduct(int[] nums) {
        int product1=nums[0];
        int product2=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=product1;
                product1=product2;
                product2=temp;
            }
            product1=Math.max(nums[i],product1*nums[i]);
            product2=Math.min(nums[i],product2*nums[i]);
            
            result=Math.max(result,product1);
        }
        return result;
    }
}
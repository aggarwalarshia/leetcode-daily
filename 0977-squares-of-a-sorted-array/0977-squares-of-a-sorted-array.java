class Solution {
    public int[] sortedSquares(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[index++]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
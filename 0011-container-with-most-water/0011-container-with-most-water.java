class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int minimum_height=Math.min(height[left],height[right]);
            max=Math.max(max,minimum_height*(right-left));
            while(left<right && height[left]<=minimum_height){
                left++;
            } 
            while(left<right && height[right]<=minimum_height){
                right--;
            } 
        }
        return max;
    }
}
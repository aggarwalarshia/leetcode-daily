// agar element is 0, toh j ko uss index pe lejaao
// aur i ko j k next index pe place kardo
// one by one check, if nums[j]=0 and nums[i]!=0 toh swap kardo dono numbers ko
// base condition, agar j=-1 hi hai, iska matlab koi bhi element 0 nhi hai array m, jo there is no point in shifting 
class Solution {
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                swap(nums,i,j);
                j++;
            }
        }
    }
}
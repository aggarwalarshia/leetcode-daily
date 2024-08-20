class Solution {
    public boolean evenSum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        if(sum%2==0) return true;
        return false;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(evenSum(i)) count++;
        }
        return count;
    }
}
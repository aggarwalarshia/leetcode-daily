class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doubled=0;
        int total=0;
        for(int i:nums)
        {
            total+=i;
            if(i<10) single+=i;
            if(i>=10 && i<100) doubled+=i;
        }
        if(single>total-single || doubled>total-doubled) return true;
        else return false;
    }
}
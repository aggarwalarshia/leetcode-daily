class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=1;
        for(int pile:piles){
            high=Math.max(high,pile);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            int hours=0;
            for(int pile:piles){
                hours+=Math.ceil(pile*1.0/mid);
            }
            if(hours<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
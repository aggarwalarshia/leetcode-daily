class Solution {
    public int findTheWinner(int n, int k) {
        // Josephus Problem

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        // game starts from 1st player which is sitting at index 0 in list
        int i=0;
        // Simple Simulation Method -> remove which element?
        // (i+k-1)
        // restart game with the same element's index which was removed 
        while(list.size()>1)
        {
            int index = (i+k-1) % list.size();
            list.remove(index);
            i=index;
        }
        return list.get(0);
    }
}
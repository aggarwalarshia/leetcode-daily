class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int factor=1;
        int result=0;
        for(char ch:s.toCharArray())
        {
            result+=(Character.getNumericValue(ch)*factor);
            factor*=-1; // OR
        //     for (int i = 0; i < numStr.length(); i++) {
        //     int digit = Character.getNumericValue(numStr.charAt(i));
            
        //     // Apply sign based on index: even index => positive, odd index => negative
        //     if (i % 2 == 0) {
        //         sum += digit;
        //     } else {
        //         sum -= digit;
        //     }
        // }

        // return sum;
        }
        return result;
    }
}
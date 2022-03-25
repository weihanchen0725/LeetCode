public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0; 
        for(int index = 0; index < 32; index++){
            result += (n & 1);
            n >>= 1;
            if(index < 31) result <<= 1;
        }
        return result;
    }
}
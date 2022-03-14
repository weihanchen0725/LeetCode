class Solution {
    public int singleNumber(int[] nums) {
        // x: 1100
        // ~y: 0011
        // if x and y are the same, then x & ~y == 0
        
        
        int seenOnce = 0;
        int seenTwice = 0;
        
        for (int i = 0; i < nums.length; i++) {
            seenOnce = (~seenTwice) & (seenOnce ^ nums[i]);
            seenTwice = (~seenOnce) & (seenTwice ^ nums[i]);            
        }
        
        return seenOnce;
    }
}
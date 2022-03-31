class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num : nums){
            bitmask ^= num;
        }
        int x = 0, diff = (bitmask)&(-bitmask);
        for(int num : nums){
            if((num&diff) > 0){
                x ^= num;
            }
        }
        return new int[]{x, bitmask^x};
    }
}
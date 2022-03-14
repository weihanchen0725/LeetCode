class Solution {
    public int[] singleNumber(int[] nums) {
        int mask = 0;
        for(int num : nums)
            mask ^= num;
        int x = 0, diff = mask&(-mask);
        for(int num : nums)
            if( (num & diff) != 0)
                x ^= num;
        return new int[]{x, mask ^ x};
    }
}
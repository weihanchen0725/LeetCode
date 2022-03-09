class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        for(int index = 1; index < length; index++)
            nums[index] += nums[index-1];
        return length * (length+1)/2 - nums[length-1];
    }
}
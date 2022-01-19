class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = nums[0], min = nums[0], max = nums[0], length = nums.length;
        for(int index = 1; index < length; index++){
            int tempMax = max, num = nums[index];
            max = Math.max(num, Math.max(num*tempMax, num*min));
            min = Math.min(num, Math.min(num*tempMax, num*min));
            result = Math.max(result, max);
        }
        return result;
    }
}
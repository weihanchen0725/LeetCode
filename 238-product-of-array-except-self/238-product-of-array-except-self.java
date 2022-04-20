class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] results = new int[length];
        results[0] = 1;
        for(int index = 1; index < length; index++){
            results[index] = results[index-1] * nums[index-1];
        }
        int temp = 1;
        for(int index = length-2; index >= 0; index--){
            results[index] *= temp * nums[index+1];
            temp *= nums[index+1];
        }
        return results;
    }
}
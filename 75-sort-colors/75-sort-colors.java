class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length, current = 0;
        int left = 0, right = length - 1;
        while(current <= right){
            if(nums[current] == 0){
                swap(nums, left, current);
                left++;
                current++;
            }else if(nums[current] == 2){
                swap(nums, right, current);
                right--;
            }else{
                current++;
            }
        }
    }
    private void swap(int[] nums, int index1, int index2){
        int tempNum = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tempNum;
    }
}
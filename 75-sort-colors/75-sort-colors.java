class Solution {
    public void sortColors(int[] nums) {
        int current = 0, left = 0, right = nums.length - 1;
        while(current <= right){
            int currentValue = nums[current];
            if(currentValue == 0){
                swap(nums, left, current);
                left++;
                current++;
            }else if(currentValue == 2){
                swap(nums, right, current);
                right--;
            }else{
                current++;
            }
        }
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
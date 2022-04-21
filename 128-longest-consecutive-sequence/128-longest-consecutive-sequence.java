class Solution {
    public int longestConsecutive(int[] nums) {
        int length = nums.length, count = 1, index = 0, max = 1;
        if(length == 0) return 0;
        Arrays.sort(nums);
        while(index < length-1){
            if(nums[index]+1 == nums[index+1]){
                count++;
                index++;
            }else if(nums[index] == nums[index+1]){
                index++;
            }else{
                max = Math.max(max, count);
                index++;
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}
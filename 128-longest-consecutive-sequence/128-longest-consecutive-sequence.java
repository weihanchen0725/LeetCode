class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1, max = 1, index = 0;
        while(index < nums.length-1){
            if(nums[index]+1 == nums[index+1]){
                count++;
                index++;
            }else if(nums[index] == nums[index+1]){
                index++;
            }else{
                max = Math.max(max, count);
                count = 1;
                index++;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
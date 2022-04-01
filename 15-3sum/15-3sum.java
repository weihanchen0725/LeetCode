class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for(int index = 0; index < nums.length; index++){
            if(index > 0 && nums[index] == nums[index-1]) continue;
            int left = index+1, right = nums.length-1;
            while(left < right){
                int sum = nums[index] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[index], nums[left], nums[right]);
                    results.add(temp);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return results;
    }
}

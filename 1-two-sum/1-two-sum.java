class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dictionary = new HashMap<>(); 
        int[] results = new int[2];
        for(int index = 0; index < nums.length; index++){
            int remain = target - nums[index];
            if(dictionary.containsKey(remain)){
                results[0] = index;
                results[1] = dictionary.get(remain);
            }
            dictionary.put(nums[index], index);
        }
        return results;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] results = new int[2];
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        for(int index = 0; index < length; index++){
            int currentTarget = target - nums[index];
            if(dictionary.containsKey(currentTarget)){
                int currentTargetIndex = dictionary.get(currentTarget);
                results[0] = (currentTargetIndex < index) ? currentTargetIndex : index;
                results[1] = (currentTargetIndex > index) ? currentTargetIndex : index;
            }
            dictionary.put(nums[index], index);
        }
        return results;
    }
}
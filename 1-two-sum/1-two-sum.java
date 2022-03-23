class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        int[] results = new int[2];
        for(int index = 0; index < nums.length; index++){
            if(dictionary.containsKey(target-nums[index])){
                results[0] = (index < dictionary.get(target-nums[index])) ? index : dictionary.get(target-nums[index]);
                results[1] = (index > dictionary.get(target-nums[index])) ? index : dictionary.get(target-nums[index]);
            }
            dictionary.put(nums[index], index);
        }
        return results;
    }
}
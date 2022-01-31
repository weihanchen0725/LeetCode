class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, results = 0, length = nums.length;
        map.put(0, 1);
        for(int index = 0; index < length; index++){
            sum += nums[index];
            if(map.containsKey(sum - k))
                results += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return results;
    }
}
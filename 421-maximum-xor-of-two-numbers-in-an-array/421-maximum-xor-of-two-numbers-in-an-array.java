class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int index = 31; index >= 0; index--){
            mask = mask | (1 << index);
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int temp = max | (1 << index);
            for(int prefix : set){
                if(set.contains(prefix ^ temp)){
                    max = temp;
                    break;
                }
            }
        }
        return max;
    }
}
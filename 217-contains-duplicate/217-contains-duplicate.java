class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dictionary = new HashSet<>();
        for(int num : nums){
            if(dictionary.contains(num))
                return true;
            else dictionary.add(num);
        }
        return false;
    }
}
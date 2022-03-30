class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums, temp, results, 0);
        return results;
    }
    public void helper(int[] nums, List<Integer> temp, List<List<Integer>> results, int index){
        if(index == nums.length){
            results.add(new ArrayList<>(temp));
            return ;
        }
        
        helper(nums, temp, results, index+1);
        temp.add(nums[index]);
        helper(nums, temp, results, index+1);
        temp.remove(temp.size()-1);
    }
}
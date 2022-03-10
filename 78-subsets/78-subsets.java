class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, current, results, 0);
        return results;
    }
    public void backtrack(int[] nums, List<Integer> current, List<List<Integer>> results, int index){
        if(index == nums.length){
            results.add(new ArrayList<>(current));
            return ;
        }
        backtrack(nums, current, results, index+1);
        current.add(nums[index]);
        backtrack(nums, current, results, index+1);
        current.remove(current.size()-1);
    }
}
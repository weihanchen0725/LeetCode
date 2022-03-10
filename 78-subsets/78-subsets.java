class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(result, current, nums, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int index){
        if(index == nums.length){
            result.add(new ArrayList<Integer>(current));
            return ;
        }
        backtrack(result, current, nums, index+1);
        current.add(nums[index]);
        backtrack(result, current, nums, index+1);
        current.remove(current.size()-1);
    }
}
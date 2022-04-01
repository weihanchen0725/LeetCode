class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(candidates, target, temp, results, 0);
        return results;
    }
    public void backtrack(int[] candidates, int target, List<Integer> temp, List<List<Integer>> results, int index){
        if(target < 0){
            return ;
        }else if(target == 0){
            results.add(new ArrayList<>(temp));
        }else{
            for(int current = index; current < candidates.length; current++){
                if(target-candidates[current] >= 0){
                    temp.add(candidates[current]);
                    backtrack(candidates, target-candidates[current], temp, results, current);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
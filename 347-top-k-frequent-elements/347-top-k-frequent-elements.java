class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        int[] results = new int[k];
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        for(int num : nums)
            dictionary.put(num, dictionary.getOrDefault(num, 0)+1);
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> dictionary.get(b)-dictionary.get(a));
        for(int key : dictionary.keySet()){
            que.offer(key);
        }
        for(int index = 0; index < results.length; index++){
            results[index] = que.poll();
        }
        return results;
    }
}
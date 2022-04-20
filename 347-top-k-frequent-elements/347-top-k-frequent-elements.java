class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            que.offer(key);
            if(que.size() > k){
                que.poll();
            }
        }
        int[] results = new int[k];
        for(int index = 0; index < results.length; index++){
            results[index] = que.poll();
        }
        return results;
    }
}
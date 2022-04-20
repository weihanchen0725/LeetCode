class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || k <= 0) return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) +1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            pq.offer(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] results = new int[k];
        for(int index = 0; index < results.length; index++){
            results[index] = pq.poll();
        }
        return results;
    }
}
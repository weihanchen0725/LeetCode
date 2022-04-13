class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int lands = 0;
    public int removeStones(int[][] stones) {
        for(int index = 0; index < stones.length; index++){
            union(stones[index][0], ~stones[index][1]);
        }
        return stones.length-lands;
    }
    public int find(int num){
        if(map.putIfAbsent(num, num) == null) lands++;
        if(num != map.get(num)) map.put(num, find(map.get(num)));
        return map.get(num);
    }
    public void union(int num1, int num2){
        num1 = find(num1);
        num2 = find(num2);
        if(num1 != num2){
            map.put(num1, num2);
            lands--;
        }
    }
}
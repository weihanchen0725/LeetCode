class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parents = new int[2001];
        for(int index = 0; index < parents.length; index++) parents[index] = index;
        for(int[] edge : edges){
            int num1 = edge[0], num2 = edge[1];
            if(find(parents, num1) == find(parents, num2)) return edge;
            else parents[find(parents, num1)] = find(parents, num2);
        }
        return new int[2];
    }
    public int find(int[] parents, int num){
        if(num != parents[num]){
            parents[num] = find(parents, parents[num]);
        }
        return parents[num];
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) return -1;
        int[] parent = new int[n], size = new int[n];
        for(int label = 0; label < n; label++){
            parent[label] = label;
            size[label] = 1;
        }
        int components = n;
        for(int[] connection : connections){
            int parent1 = findParent(parent, connection[0]);
            int parent2 = findParent(parent, connection[1]);
            if(parent1 != parent2){
                if(size[parent1] < size[parent2]){
                    size[parent2] += size[parent1];
                    parent[parent1] = parent2;
                }else{
                    size[parent1] += size[parent2];
                    parent[parent2] = parent1;
                }
                components--;
            }
        }
        return components-1;
    }
    public int findParent(int[] parent, int num){
        if(num == parent[num]) return num;
        return parent[num] = findParent(parent, parent[num]);
    }
}
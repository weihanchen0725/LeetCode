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
            int num1 = findParent(parent, connection[0]);
            int num2 = findParent(parent, connection[1]);
            if(num1 != num2){
                if(size[num1] < size[num2]){
                    size[num2] += size[num1];
                    parent[num1] = num2;
                }else{
                    size[num1] += size[num2];
                    parent[num2] = num1;
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
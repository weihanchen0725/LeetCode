class Solution {
    public int findCircleNum(int[][] isConnected) {
        int length = isConnected.length, count = 0;
        int[] visited = new int[length];
        for(int index = 0; index < length; index++){
            if(visited[index] == 0){
                dfs(isConnected, visited, index);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected, int[] visited, int index1){
        for(int index2 = 0; index2 < isConnected.length; index2++){
            if(isConnected[index1][index2] == 1 && visited[index2] == 0){
                visited[index2] = 1;
                dfs(isConnected, visited, index2);
            }
        }
    }
}
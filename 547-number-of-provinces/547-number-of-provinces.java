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
    public void dfs(int[][] isConnected, int[] visited, int index){
        for(int jIndex = 0; jIndex < isConnected.length; jIndex++){
            if(isConnected[index][jIndex] == 1 && visited[jIndex] == 0){
                visited[jIndex] = 1;
                dfs(isConnected, visited, jIndex);
                
            }
        }
    }
}
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
        for(int anotherIndex = 0; anotherIndex < isConnected.length; anotherIndex++){
            if(isConnected[index][anotherIndex] == 1 && visited[anotherIndex] == 0){
                visited[anotherIndex] = 1;
                dfs(isConnected, visited, anotherIndex);
            }
        }
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] used = new boolean[n];
        used[source] = true;
        boolean tempUsed = true;
        while(!used[destination] && tempUsed){
            tempUsed = false;
            for(int index = edges.length-1; index >= 0; index--){
                if(used[edges[index][0]]){
                    if(!used[edges[index][1]])
                        tempUsed = used[edges[index][1]] = true;
                }else if(used[edges[index][1]]){
                    tempUsed = used[edges[index][0]] = true;
                }
            }
        }
        return used[destination];
    }
}
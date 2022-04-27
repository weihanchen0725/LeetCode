class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        for(int index = 0; index < numCourses; index++)
            map.add(new ArrayList<Integer>());
        for(int[] pre : prerequisites){
            int must = pre[1];
            int course = pre[0];
            map.get(course).add(must);
        }
        int[] visited = new int[numCourses];
        for(int index = 0; index < visited.length; index++){
            if(visited[index] != 1){
                if(cycle(map, visited, index)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean cycle(ArrayList<ArrayList<Integer>> map, int[] visited, int index){
        if(visited[index] != 0) return visited[index] == -1;
        visited[index] = -1;
        ArrayList<Integer> must = map.get(index);
        for(int m : must){
            if(visited[m] != 1){
                if(cycle(map, visited, m)){
                    return true;
                }
            }
        }
        visited[index] = 1;
        return false;
    }
}
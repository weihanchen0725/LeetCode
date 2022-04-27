class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> map = new ArrayList<>();
        for(int index = 0; index < numCourses; index++){
            map.add(new ArrayList<>());
        }
        for(int[] course : prerequisites){
            map.get(course[1]).add(course[0]);
        }
        boolean[] checked = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();
        for(int index = 0; index < numCourses; index++){
            if(dfs(map, checked, visited, index, stack)){
                return new int[0];
            }
        }
        int[] results = new int[numCourses];
        for(int index = 0; index < results.length; index++){
            results[index] = stack.pop();
        }
        return results;
    }
    public boolean dfs(List<List<Integer>> map, boolean[] checked, boolean[] visited, int index, Stack<Integer> stack){
        if(visited[index]) return true;
        if(checked[index]) return false;
        visited[index] = true;
        for(int nextCourse : map.get(index)){
            if(dfs(map, checked, visited, nextCourse, stack)){
                return true;
            }
        }
        visited[index] = false;
        checked[index] = true;
        stack.add(index);
        return false;
    }
}
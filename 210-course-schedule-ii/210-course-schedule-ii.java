class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> dependency = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            dependency.add(new ArrayList<>());
        }
        for (int[] course: prerequisites) {
            dependency.get(course[1]).add(course[0]);
        }
        
        boolean[] visited = new boolean[numCourses];
        boolean[] checked = new boolean[numCourses];
        Stack<Integer> courses = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (dfs(dependency, checked, visited, i, courses)) {
                return new int[0];
            }
        }
        
        int[] results = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            results[i] = courses.pop();
        }
        return results;
    }
    
    private boolean dfs(List<List<Integer>> dependency, 
                        boolean[] checked, 
                        boolean[] visited, 
                        int cur,
                        Stack<Integer> courses) {
        if (visited[cur]) {
            return true;
        }
        
        if (checked[cur]) {
            return false;
        }
        
        visited[cur] = true;
        
        for (int nextCourse: dependency.get(cur)) {
            if (dfs(dependency, checked, visited, nextCourse, courses)) {
                return true;
            }
        }
        
        visited[cur] = false;
        checked[cur] = true;
        courses.add(cur);
        return false;
    }
}
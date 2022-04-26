class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] counts = new int[n+1];
        for(int[] t : trust){
            counts[t[0]]--;
            counts[t[1]]++;
        }
        for(int index = 1; index < counts.length; index++)
            if(counts[index] == n-1)
                return index;
        return -1;
    }
}
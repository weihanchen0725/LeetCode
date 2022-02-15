class Solution {
    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if(length <= 1) return intervals;
        int[] start = new int[length], end = new int[length];
        for(int index = 0; index < length; index++){
            start[index] = intervals[index][0];
            end[index] = intervals[index][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        ArrayList<int[]> list = new ArrayList<>();
        int startIndex = 0, endIndex = 0;
        while(endIndex < length){
            if(endIndex == length-1 || start[endIndex+1] > end[endIndex]){
                list.add(new int[]{start[startIndex], end[endIndex]});
                startIndex = endIndex+1;
            }
            endIndex++;
        }
        int[][] results = new int[list.size()][2];
        for(int index = 0; index < list.size(); index++){
            results[index][0] = list.get(index)[0];
            results[index][1] = list.get(index)[1];
        }
        return results;
    }
}
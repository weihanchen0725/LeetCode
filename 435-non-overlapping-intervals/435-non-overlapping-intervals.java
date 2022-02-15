class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        if(length <= 1) return 0;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int count = 1, end = intervals[0][1];
        for(int index = 1; index < length; index++){
            if(intervals[index][0] >= end){
                end = intervals[index][1];
                count++;
            }
        }
        return length-count;
    }
}
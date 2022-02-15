class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1];
        ArrayList<int[]> list = new ArrayList<>();
        for(int[] curIntervals : intervals){
            int curStart = curIntervals[0], curEnd = curIntervals[1];
            if(curEnd < newStart){
                list.add(new int[]{curStart, curEnd});
            }else if(newEnd < curStart){
                list.add(new int[]{newStart, newEnd});
                newStart = curStart;
                newEnd = curEnd;
            }else{
                newStart = Math.min(newStart, curStart);
                newEnd = Math.max(newEnd, curEnd);
            }
        }
        list.add(new int[]{newStart, newEnd});
        return list.toArray(new int[list.size()][]);
    }
}
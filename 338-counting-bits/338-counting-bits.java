class Solution {
    public int[] countBits(int n) {
        int[] results = new int[n+1];
        for(int index = 0; index < results.length; index++){
            results[index] = results[index>>1] + index%2;
        }
        return results;
    }
}
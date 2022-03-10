class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int index=0; index<sArr.length; index++)
            sum += tArr[index] - sArr[index];
        sum += tArr[tArr.length-1];
        return (char)sum;
    }
}
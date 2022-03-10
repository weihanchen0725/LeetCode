class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int index = 0; index < s.length(); index++)
            sum += t.charAt(index) - s.charAt(index);
        sum += t.charAt(t.length()-1);
        return (char)sum;
    }
}
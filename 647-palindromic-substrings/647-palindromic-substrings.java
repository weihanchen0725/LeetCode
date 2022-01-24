class Solution {
    public int count = 0;
    public int countSubstrings(String s) {
        for(int index = 0; index < s.length(); index++){
            countPalindrome(s, index, index);
            countPalindrome(s, index, index+1);
        }
        return count;
    }
    public void countPalindrome(String str, int left, int right){
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
            count++;
        }
    }
}
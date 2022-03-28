class Solution {
    public int low = 0, high = 1;
    public String longestPalindrome(String s) {
        for(int index = 0; index < s.length(); index++){
            isPalindrome(s, index, index);
            isPalindrome(s, index, index+1);
        }
        return s.substring(low, low+high);
    }
    public void isPalindrome(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        if(high < right-left-1){
            low = left+1;
            high = right-left-1;
        }
    }
}
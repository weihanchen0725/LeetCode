class Solution {
    public boolean validPalindrome(String s) {
        if(s == null) return false;
        if(s.length() == 0) return true;
        int length = s.length(), left = 0, right = length-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                boolean option1 = isPalindrome(s.substring(left+1, right+1));
                boolean option2 = isPalindrome(s.substring(left, right));
                return option1 || option2;
            }
        }
        return true;
    }
    private boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
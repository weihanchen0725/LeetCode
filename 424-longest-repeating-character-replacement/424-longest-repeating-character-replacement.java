class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0, maxLength = 0, maxCount = 0;
        for(int end = 0; end < s.length(); end++){
            maxCount = Math.max(maxCount, ++count[s.charAt(end)-'A']);
            while(end-start-maxCount+1>k){
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
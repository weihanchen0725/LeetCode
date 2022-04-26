class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, length = s.length();
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for(int left = 0, right = 0; right < length; right++){
            if(dictionary.containsKey(s.charAt(right))){
                left = Math.max(left, dictionary.get(s.charAt(right))+1);
            }
            dictionary.put(s.charAt(right), right);
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int left = 0, right = 0; right < length; right++){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right))+1);
            map.put(s.charAt(right), right);
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
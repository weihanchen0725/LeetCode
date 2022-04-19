class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] dictionary = new int[26];
        for(char sChar : s.toCharArray()) dictionary[sChar-'a']++;
        for(char tChar : t.toCharArray()) dictionary[tChar-'a']--;
        for(int num : dictionary) if(num != 0) return false;
        return true;
    }
}
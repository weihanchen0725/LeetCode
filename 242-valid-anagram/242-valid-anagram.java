class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] dictionary = new int[26];
        for(char c : s.toCharArray())
            dictionary[c-'a']++;
        for(char c : t.toCharArray())
            dictionary[c-'a']--;
        for(int num : dictionary)
            if(num > 0)
                return false;
        return true;
    }
}
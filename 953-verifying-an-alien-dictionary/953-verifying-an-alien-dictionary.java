class Solution {
    public int[] dictionary = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int index = 0; index < order.length(); index++){
            dictionary[order.charAt(index)-'a'] = index;
        }
        for(int index = 1; index < words.length; index++){
            if(helper(words[index-1], words[index])){
                return false;
            }
        }
        return true;
    }
    public boolean helper(String word1, String word2){
        int length1 = word1.length(), length2 = word2.length();
        for(int index = 0; index < length1 && index < length2; index++){
            if(word1.charAt(index) != word2.charAt(index)){
                return dictionary[word1.charAt(index)-'a'] > dictionary[word2.charAt(index)-'a'];
            }
        }
        return length1 > length2;
    }
}
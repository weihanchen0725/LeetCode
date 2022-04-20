class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dictionary = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String anagram = String.valueOf(charArray);
            dictionary.putIfAbsent(anagram, new ArrayList<String>());
            dictionary.get(anagram).add(str);
        }
        return new ArrayList<>(dictionary.values());
    }
}
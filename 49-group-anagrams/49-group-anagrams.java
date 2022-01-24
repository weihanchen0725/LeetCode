class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> results = new HashMap<>();
        for(String str : strs){
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String anagram = String.valueOf(charStr);
            results.putIfAbsent(anagram, new ArrayList<>());
            results.get(anagram).add(str);
        }
        return new ArrayList<>(results.values());
    }
}
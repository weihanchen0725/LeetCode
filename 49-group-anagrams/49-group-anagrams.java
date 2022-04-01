class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> results = new HashMap<>();
        for(String str : strs){
            char[] charSTR = str.toCharArray();
            Arrays.sort(charSTR);
            String anagram = String.valueOf(charSTR);
            results.putIfAbsent(anagram, new ArrayList<String>());
            results.get(anagram).add(str);
        }
        return new ArrayList<>(results.values());
    }
}
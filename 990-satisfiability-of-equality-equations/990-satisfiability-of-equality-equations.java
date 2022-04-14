class Solution {
    int[] dictionary = new int[26];
    public boolean equationsPossible(String[] equations) {
        for(int label = 0; label < 26; label++)
            dictionary[label] = label;
        for(String equation : equations)
            if(equation.charAt(1) == '=')
                dictionary[find(equation.charAt(0)-'a')] = find(equation.charAt(3)-'a');
        for(String equation : equations)
            if(equation.charAt(1) == '!' && find(equation.charAt(0)-'a') == find(equation.charAt(3)-'a'))
                return false;
        return true;
    }
    public int find(int num){
        if(num != dictionary[num])
            dictionary[num] = find(dictionary[num]);
        return dictionary[num];
    }
}
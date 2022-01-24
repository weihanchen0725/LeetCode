class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacks = new Stack<>();
        for(char currentParen : s.toCharArray()){
            switch(currentParen){
                case '(':
                case '[':
                case '{':
                    stacks.push(currentParen);
                    break;
                case')':
                    if(!stacks.isEmpty() && stacks.peek() == '(') stacks.pop();
                    else return false;
                    break;
                case']':
                    if(!stacks.isEmpty() && stacks.peek() == '[') stacks.pop();
                    else return false;
                    break;
                case'}':
                    if(!stacks.isEmpty() && stacks.peek() == '{') stacks.pop();
                    else return false;
                    break;                    
            }
        }
        return stacks.isEmpty();
    }
}
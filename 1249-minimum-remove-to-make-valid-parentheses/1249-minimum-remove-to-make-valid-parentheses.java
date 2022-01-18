class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] chArray = s.toCharArray();
        int count = 0, length = chArray.length;
        for(int index = 0; index < length; index++){
            if(chArray[index] == '('){
                count++;
            }else if(chArray[index] == ')'){
                if(count > 0){
                    count--;
                }else{
                    chArray[index] = '.';
                }
            }
        }
        for(int index = length - 1; index >= 0; index--){
            if(count > 0 && chArray[index] == '('){
                chArray[index] = '.';
                count--;
            }
        }
        for(int index = 0; index < length; index++){
            if(chArray[index] != '.'){
                chArray[count++] = chArray[index];
            }
        }
        return new String(chArray).substring(0, count);
    }
}
class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        
        int defVal = 0;
        
        if(num < 0){
            defVal = 15;
            num = (-1 * num) - 1;
        }
        
        return convertHex(num, defVal);
    }
    public String convertHex(int num, int defVal){
        char[] charArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int result = (defVal > 0) ? (defVal - num % 16) : num % 16;
            sb.append(charArray[result]);
            num /= 16;
        }
        if(defVal > 0)
            while(sb.length() < 8)
                sb.append(charArray[defVal]);
        
        return sb.reverse().toString();
    }
}
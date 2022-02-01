class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carryOver = 0;
        for(int index1 = num1.length()-1, index2 = num2.length()-1; index1>=0 || index2>=0 || carryOver==1; index1--, index2--){
            int n1 = (index1<0) ? 0 : num1.charAt(index1)-'0';
            int n2 = (index2<0) ? 0 : num2.charAt(index2)-'0';
            sb.append((carryOver+n1+n2)%10);
            carryOver = (carryOver+n1+n2)/10;
        }
        return sb.reverse().toString();
    }
}
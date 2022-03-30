class Solution {
    public int minFlips(int a, int b, int c) {
        int result = 0, ab = a|b, equal = ab^c;
        for(int index = 0; index <32; index++){
            int bitmask = 1 << index;
            if((bitmask & equal) > 0){
                result += ((a&bitmask) == (b&bitmask) && (c&bitmask) == 0) ? 2 : 1;
            }
        }
        return result;
    }
}

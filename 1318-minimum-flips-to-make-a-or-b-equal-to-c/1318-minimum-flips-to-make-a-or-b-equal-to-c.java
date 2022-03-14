class Solution {
    public int minFlips(int a, int b, int c) {
        int result = 0, ab = a|b, equal = ab^c;
        for(int index = 0; index < 32; index++){
            int mask = 1 << index;
            if((mask&equal) > 0)
                result += ((a&mask) == (b&mask) && (c&mask) == 0) ? 2 : 1;
        }
        return result;
    }
}
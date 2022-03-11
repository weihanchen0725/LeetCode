class Solution {
    public int minFlips(int a, int b, int c) {
        int results = 0, ab = a|b, equal = ab^c;
        for(int index = 0; index < 31; index++){
            int mask = 1 << index;
            if((equal & mask) > 0)
                results += (a&mask) == (b&mask) && (c&mask) == 0 ? 2 : 1;
        }
        return results;
    }
}
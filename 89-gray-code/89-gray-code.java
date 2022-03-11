class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> results = new ArrayList<>();
        if(n == 0) 
            results.add(0);
        else
            for(int index = 0; index < (1<<n); index++)
                results.add((index^(index>>1)));
        return results;
                        
    }
}
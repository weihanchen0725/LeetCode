class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 3) return new int[]{1, 2};
        int[] results = new int[2];
        int left = 0, right = numbers.length-1;
        while(left <= right){
            int currentNum = numbers[left] + numbers[right];
            if(currentNum == target){
                results[0] = left+1;
                results[1] = right+1;
                break;
            }else if(target > currentNum){
                left++;
            }else{
                right--;
            }
        }
        return results;
    }
}

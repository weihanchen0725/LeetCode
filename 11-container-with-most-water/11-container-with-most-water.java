class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0, minHeight = Integer.MAX_VALUE, length = height.length, left = 0, right = length-1;
        while(left < right){
            minHeight = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, (right-left)*minHeight);
            while(left < right && height[left] <= minHeight) left++;
            while(left < right && height[right] <= minHeight) right--;
        }
        return maxWater;
    }
}
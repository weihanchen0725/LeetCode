class Solution {
    public int maxArea(int[] height) {
        int length = height.length, water = 0, left = 0, right = length - 1;
        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            water = Math.max(water, minHeight*(right-left));
            if(left < right && height[left] <= minHeight) left++;
            if(left < right && height[right] <= minHeight) right--;
        }
        return water;
    }
}
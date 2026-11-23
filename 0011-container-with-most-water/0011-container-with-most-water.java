class Solution {
    public int maxArea(int[] height) {
       // left pointer at index 0, right pointer at index height.length - 1
       int n = height.length;
       int left = 0;
       int right = n - 1;
       int maxArea = 0;
       // check from the lower bar: is there another bar that is higher?
       while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, h * (right - left));
            if (height[left] < height[right]) {
                while (left < right && height[left] <= h) {
                    left++;
                }
            } else {
                while (left < right && height[right] <= h) {
                    right--;
                }
            }
       }
       return maxArea;
    }
}
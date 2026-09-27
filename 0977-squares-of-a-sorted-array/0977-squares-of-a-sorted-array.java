class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int [nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        while(left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq) {
                res[pos] = leftSq;
                left++;
            } else {
                res[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return res;
    }
}
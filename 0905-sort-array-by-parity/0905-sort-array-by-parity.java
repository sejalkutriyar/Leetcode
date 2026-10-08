class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            if(nums[i] % 2 == 0) {
                i++;
            } else {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(nums[j] % 2 == 1) {
                j--;
            } else {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
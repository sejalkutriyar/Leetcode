class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int [nums.length];
        int i = 0;
        int j = 0;
        int k = 1;
        while(i<nums.length && j < nums.length || k < nums.length){
            if(nums[i]>= 0){
                ans[j] =  nums[i];
                j = j+2;
            }else{
                ans[k] = nums[i];
                k = k+2;
            }
           i++;
        }
        return ans;
    }
}
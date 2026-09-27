class Solution {
    public int findClosestNumber(int[] nums) {
        int minDist = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]-0);
            if(a<minDist){
                minDist = a;
                res = nums[i];
            }else if(a==minDist){
                res = Math.max(res,nums[i]);
            }
        }
        return res;
    }
}
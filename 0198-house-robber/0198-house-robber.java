class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0)  return 0;
        if(n == 1)  return nums[0];

        int prev1 = 0, prev2 = 0;
        for(int i = 0;i<n;i++){
            int temp = prev1;
            prev1 = Math.max(prev2+nums[i], prev1);
            prev2 = temp;        
        }
        return prev1;
    }
}
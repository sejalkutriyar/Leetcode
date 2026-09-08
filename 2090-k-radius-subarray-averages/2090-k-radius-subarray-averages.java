class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        if(k == 0) {
            return nums;
        }
        int i = k;
        while(i < nums.length-k) {
            long sum = 0;
            for(int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            ans[i] = (int) (sum / (2*k+1));
            i++;
        }
        return ans;
    }
}
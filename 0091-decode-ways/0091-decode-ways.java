class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp, -1);
        return solve(s, 0, dp);
    }
    public int solve(String s, int i, int[] dp) {
        if(i == s.length()) {
            return 1;
        }
        if(s.charAt(i) == '0') {
            return 0;
        }
        if(dp[i] != -1) {
            return dp[i];
        }
        int way1 = solve(s, i+1, dp);
        int way2 = 0;
        if(i+1<s.length()) {
            if(s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) <= '6') {
                way2 = solve(s, i+2, dp);
            }
        }
        dp[i] =  way1+way2;
        return dp[i];
    }
}
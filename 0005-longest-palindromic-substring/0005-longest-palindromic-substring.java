class Solution {
    private String expendFromCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
    public String longestPalindrome(String s) {
        // code here
        if(s.length() <= 1) return s;
        String maxStr = s.substring(0,1);
        for(int i = 0; i < s.length() - 1; i++) {
            String odd = expendFromCenter(s, i, i);
            String even = expendFromCenter(s, i, i+1);
            if(odd.length() > maxStr.length()) maxStr = odd;
            if(even.length() > maxStr.length()) maxStr = even;
        }
        return maxStr;
    }
}
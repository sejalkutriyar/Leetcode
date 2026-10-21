class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            String ans = "";
            for(int j = i; j < s.length(); j++) {
                ans += s.charAt(j);
                if(palindrome(ans)) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean palindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
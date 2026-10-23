class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }
            if (!st.isEmpty() || ch != '0') {
                st.push(ch);
            }
        }
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        for (char ch : st) {
            ans += ch;
        }
        return ans.isEmpty() ? "0" : ans;
    }
}
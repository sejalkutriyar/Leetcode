class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                if(!stack.isEmpty()) {
                    res += ch;
                }
                stack.push(ch);
            } else {
                stack.pop();
                if(!stack.isEmpty()) {
                    res += ch;
                }
            }
        }
        return res;
    }
}
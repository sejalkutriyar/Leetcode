class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
                st.add(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st ){
            ans.append(c);
        }
        return ans.toString();
    }
}
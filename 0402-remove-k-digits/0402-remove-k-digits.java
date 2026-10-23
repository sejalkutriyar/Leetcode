class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> stack = new Stack <>();
        String ans = "";
        for(int i = 0 ; i < num.length() ; i++){
            while(!stack.isEmpty() && num.charAt(i) < stack.peek() && k > 0){
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && num.charAt(i) == '0'){
                continue;
            }
            stack.push(num.charAt(i));
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        String result = "";
        for (char ch : stack) {
            result+=ch;
        }
        return result == "" ? "0" : result;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = 0;
        st.push(n-1);
        for(int i = n-2; i >=0; i--) {
            while(st.size() > 0 && temp[i] >= temp[st.peek()]) {
                st.pop();
            }
            if(st.size() == 0) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!st.empty() && h[st.peek()] >= h[i]){
                st.pop();
            }
            left[i] = st.empty()? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        for(int i = n-1;i>=0;i--){
            while(!st.empty() && h[st.peek()] >= h[i]){
                st.pop();
            }
            right[i] = st.empty()? n : st.peek();
            st.push(i);
        }

        int res = 0;
        for(int i = 0;i < n;i++){
            res = Math.max(res, h[i] * (right[i]- left[i] - 1));
        }
        return res;
    }
}
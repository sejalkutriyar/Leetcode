class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;
        int[] h = new int[col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j<col;j++){
                if(matrix[i][j] == '1') h[j]++;
                else h[j] = 0;
            }
            res = Math.max(res, largestRectangleArea(h));
        }
        return res;
    }

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
class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0; i<height.length; i++){
            while(!st.empty() && height[i]>height[st.peek()]){
                int top = st.pop();
                if(st.empty()){
                    break;
                }
                int h= Math.min(height[i], height[st.peek()])-height[top];
                int w= (i -st.peek())-1;
                int water= (h*w);
                ans=ans+water;
            }
            st.push(i);
        }
        return ans;
    }
}
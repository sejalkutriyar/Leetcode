class MinStack {
    Stack<Long> st = new Stack<>();
    long minEle;
    public MinStack() {
    }
    
    public void push(int val) {
        long value = val;
        if(st.isEmpty()) {
            minEle = value;
            st.push(value);
        } else if (val<=minEle) {
            st.push((2*value) - minEle);
            minEle =value;
        } else {
            st.push(value);
        }
    }
    
    public void pop() {
        if(st.peek() <= minEle) {
            long dummy = st.pop();
            minEle = ((2*minEle) - dummy);
        }
        else {
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) {
            return -1;
        }
        else if (st.peek() <= minEle) {
            return (int)minEle;
        }
        else {
            long t = st.peek();
            return (int)t;
        }
    }
    
    public int getMin() {
        return (int)minEle;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class BrowserHistory {
    Stack<String> foreward;
    Stack<String> backward;
    String current;
    public BrowserHistory(String homepage) {
        foreward = new Stack<>();
        backward = new Stack<>();
        current = homepage;
        
    }
    
    public void visit(String url) {
        backward.push(current);
        current = url ;
        foreward.clear();
        
    }
    
    public String back(int steps) {
        while(steps > 0 && !backward.empty()){
            foreward.push(current);
            current = backward.pop();
            steps--;
        }
        return current;
        
    }
    
    public String forward(int steps) {
        while(steps > 0 && !foreward.empty()){
            backward.push(current);
            current = foreward.pop();
            steps--;
        }
        return current ;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
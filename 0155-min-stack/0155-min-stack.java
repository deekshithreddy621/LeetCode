class MinStack {
    Stack<Integer> stack1; 
    Stack<Integer> stack2;
    
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);
        if(!stack2.empty() && stack2.peek()<val){
            stack2.push(stack2.peek());
        }
        else{
            stack2.push(val);
        }
    }
    
    public void pop() {
        if(!stack1.empty()){
            stack1.pop();
            stack2.pop();
        }
    }
    
    public int top() {
        int p = -1;
        if(!stack1.empty()){
            p = (int)stack1.peek();
        }
        return (int)p;
    }
    
    public int getMin() {
        if(!stack2.empty()){
            return stack2.peek();
        }
        return -1;
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
class MyQueue {
    Stack <Integer> stack1;
    Stack <Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.empty()){
            Integer p = (Integer)stack1.pop();
            stack2.push(p);
        }
        Integer popp = (Integer)stack2.pop();
        while(!stack2.empty()){
            Integer p = (Integer)stack2.pop();
            stack1.push(p);
        }
        return (int)popp;
    }
    
    public int peek() {
        while(!stack1.empty()){
            Integer p = (Integer)stack1.pop();
            stack2.push(p);
        }
        Integer popp = (Integer)stack2.peek();
        while(!stack2.empty()){
            Integer p = (Integer)stack2.pop();
            stack1.push(p);
        }
        return (int)popp;
    }
    
    public boolean empty() {
        if(stack1.empty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
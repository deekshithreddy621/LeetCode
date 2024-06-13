class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    
    public MyStack() {
        this.queue1 = new LinkedList<Integer>();
        this.queue2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }
        Queue<Integer> queue3 = queue1;
        queue1 = queue2;
        queue2 = queue3;
    }
    
    public int pop() {
        if(!queue1.isEmpty())
            return queue1.remove();
        return -1;
    }
    
    public int top() {
        if(!queue1.isEmpty())
            return queue1.peek();
        return -1;
    }
    
    public boolean empty() {
        if(queue1.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
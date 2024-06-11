class CustomStack {
    Stack <Integer> stack1;
    Stack <Integer> stack2;
    int maxSize;
    int currentSize;

    public CustomStack(int maxSize) {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        this.maxSize = maxSize;   
        this.currentSize = 0;
    }
    
    public void push(int x) {
        if(currentSize<maxSize){
            stack1.push(x);
            currentSize++;
        }
    }
    
    public int pop() {
        if(!stack1.empty()){
            currentSize--;
            return (int)stack1.pop();
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.empty() && k>0){
            stack1.push(stack2.pop() + val);
            k--;
        }
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
class MyCircularQueue {
    int ar[];
    int f,r,maxSize,size;
    public MyCircularQueue(int k) {
        ar = new int[k];
        f=0;
        r=0;
        maxSize = k;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        ar[r] = value;
        r = (r+1)%maxSize;
        
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        f = (f+1)%maxSize;
        size--;
        return true;
                
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return ar[f];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        return ar[(r-1+maxSize)%maxSize];
    }
    
    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if((size == maxSize)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
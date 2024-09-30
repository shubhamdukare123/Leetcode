class CustomStack {

    int[] stackArr;
    int top;

    public CustomStack(int maxSize) {
        stackArr = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top < stackArr.length-1) {
            stackArr[++top] = x;
            
        }
    }
    
    public int pop() {
        if(top != -1) {
            return stackArr[top--];
        }else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        if(top < k) {
            for(int i=0; i<= top; i++) {
                stackArr[i] += val;
            }
        }else{
                for(int i=0; i<k; i++) {
                    stackArr[i] += val;
                }
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
//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.poll());
        }
        
        while(!s.isEmpty()) {
            q.offer(s.pop());
        }
        
        return q;
        
        
    }
}

import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=sandwiches.length-1; i>=0; i--) {
            s.push(sandwiches[i]);
        }

        for(int i=0; i<students.length; i++) {
            q.offer(students[i]);
        }
        int count = 0;
        while(!q.isEmpty()){
            if(s.peek() == q.peek()) {
                s.pop();
                q.poll();
                count = 0;
            }else{
                q.add(q.poll());
                count++;
                if(count == q.size()) {
                    return q.size();
                }
            }
        }
        return 0;
    }
}
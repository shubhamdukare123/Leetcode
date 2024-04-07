import java.util.*;
class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.add(i);
        }

        int count = 0;
        while(q.size() > 1) {
            for(int i=0; i<q.size(); i++){
                if(q.size() == 1){
                    return q.get(0);
                }

                count++;
                if(count == k) {
                    q.remove(i);
                    count = 0;
                    i--;
                }

            } 
        }

        return q.get(0);

    }
}
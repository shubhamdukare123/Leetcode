import java.util.*;
class RecentCounter {
    ArrayList<Integer> al;
    public RecentCounter() {
        this.al = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        al.add(t);
        int req = 0;
        for(int i=0; i<al.size(); i++){
            if(al.get(i) >= t-3000){
                req++;
            }
        }
        return req;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
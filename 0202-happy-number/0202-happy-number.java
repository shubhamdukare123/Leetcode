class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();
        
        while(!st.contains(n)) {
            if(n == 1)
                return true;
            st.add(n);
            int sqNum = 0;
            while(n != 0) {
                sqNum += (n%10) * (n%10);
                n = n/10;
            }
            n = sqNum;
        }

        return false;
    }
}
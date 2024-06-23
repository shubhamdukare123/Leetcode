import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+ 1);
            }else{
                hm.put(arr[i], 1);
            }
        }

        Set<Integer> st = hm.keySet();
        Iterator<Integer> itr = st.iterator();

        int luckyNo = -1;
        while(itr.hasNext()) {
            int val = itr.next().intValue();

            if(val == hm.get(val)) {
                luckyNo = val;
            }
        }

        return luckyNo;
    }
}
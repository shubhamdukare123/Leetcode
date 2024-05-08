import java.util.*;
class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++) {

            char ch = t.charAt(i);

            if(hm.containsKey(ch)) {
                if(hm.get(ch) != 0)
                    hm.put(ch, hm.get(ch) - 1);
            }
        }

        int count = 0;

        Object[] st = hm.keySet().toArray();

        for(int i=0; i<st.length; i++) {
            count = count + hm.get(st[i]);
        }     

        return count;


    }
}

T.C - O(N * N)
S.C - O(N square)

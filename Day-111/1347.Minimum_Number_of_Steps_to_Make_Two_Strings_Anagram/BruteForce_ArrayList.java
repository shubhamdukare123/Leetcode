import java.util.*;
class Solution {
    public int minSteps(String s, String t) {
        ArrayList<Character> lst = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            lst.add(s.charAt(i));
        }

        for(int i=0; i<t.length(); i++) {
            if(lst.contains(t.charAt(i))) {
                lst.remove(new Character(t.charAt(i)));
            }
        }

        return lst.size();

    }
}
TC - O(N * N * N)
SC - O(N)

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxCount = 0;
        while(j<s.length()) {
            if(hm.containsKey(s.charAt(j))) {
                if(hm.get(s.charAt(j)) + 1 > i){
                    i = hm.get(s.charAt(j)) + 1;
                }  
                hm.put(s.charAt(j),j);
            }else{
                hm.put(s.charAt(j), j);    
            }

            if(j-i+1 > maxCount) {
                maxCount = j-i+1;
            }
            j++;
        }
        return maxCount;        
    }
}
import java.util.*;
class Solution {
    public String sortVowels(String s) {

        HashMap<Character, Integer> lHm = new LinkedHashMap<>();

        lHm.put('A', 0);
        lHm.put('E', 0);
        lHm.put('I', 0);
        lHm.put('O', 0);
        lHm.put('U', 0);
        lHm.put('a', 0);
        lHm.put('e', 0);
        lHm.put('i', 0);
        lHm.put('o', 0);
        lHm.put('u', 0);

        for(int i=0; i<s.length(); i++) {
            if(lHm.containsKey(s.charAt(i))) {
                lHm.put(s.charAt(i), lHm.get(s.charAt(i)) + 1);
            }
        }

        String vowel = "AEIOUaeiou";
        int j=0;


        String t = "";
        for(int i=0; i<s.length(); i++) {
            if(!lHm.containsKey(s.charAt(i))) {
                t = t + s.charAt(i);                
            }else{
                while(j<vowel.length()) {
                    if(lHm.get(vowel.charAt(j)) == 0) {
                        j++;
                    }else{
                        break;
                    }
                }
                t = t + vowel.charAt(j);
                lHm.put(vowel.charAt(j), lHm.get(vowel.charAt(j)) - 1);
            } 
        }
        

        return t;

    }
}

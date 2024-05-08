import java.util.*;
class Solution {
    public String sortVowels(String s) {
        List<Character> vowelLst = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' ||s.charAt(i) == 'U' || s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
                vowelLst.add(s.charAt(i));
            }
        }

        Collections.sort(vowelLst);
        int itr = 0;
        String t = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' ||s.charAt(i) == 'U' || s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
                t = t + vowelLst.get(itr++);
            }else {
                t = t + s.charAt(i);
            }
        }

        return t;

    }
}

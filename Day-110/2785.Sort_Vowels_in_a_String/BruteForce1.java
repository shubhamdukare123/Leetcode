import java.util.*;
class Solution {
    public String sortVowels(String s) {
        List<Character> vowelLst = new ArrayList<>();
        List<Integer> vIndexLst = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' ||s.charAt(i) == 'U' || s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
                vowelLst.add(s.charAt(i));
                vIndexLst.add(i);
            }
        }

        Collections.sort(vowelLst);
        for(int i=0; i<vIndexLst.size(); i++) {
            s = s.substring(0, vIndexLst.get(i)) + vowelLst.get(i) + s.substring(vIndexLst.get(i) + 1);
        }

        return s;

    }
}

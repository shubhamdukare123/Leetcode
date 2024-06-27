class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' ||ch == 'u'){
                st.push(ch);
            }
        }

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' ||ch == 'u'){
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(i, st.pop());
                s = sb.toString();
            }
        }

        return s;
    }
}
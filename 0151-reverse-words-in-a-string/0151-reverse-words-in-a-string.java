class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        Stack<String> st = new Stack<>();

        String temp = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                if(temp == "")
                    continue;
                st.push(temp);
                temp = "";
            }else if(i == s.length() - 1) {
                temp = temp + s.charAt(i);
                st.push(temp);
                temp = "";
            }else {
                temp = temp + s.charAt(i);
            }
        }
        
        while(!st.isEmpty()) {
            
            temp = temp + st.pop() + " ";
        }

        return temp.trim();

    }
}
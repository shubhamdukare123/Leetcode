class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I' && i != s.length()-1) {
                if(s.charAt(i+1) == 'V') {
                    num = num + 4;
                    i++;
                    continue;
                }else if(s.charAt(i+1) == 'X'){
                    num = num + 9;
                    i++;
                    continue;
                }else{
                    num = num + 1;
                    continue;
                }
            }

            if(s.charAt(i) == 'X' && i != s.length()-1) {
                if(s.charAt(i+1) == 'L') {
                    num = num + 40;
                    i++;
                    continue;
                }else if(s.charAt(i+1) == 'C') {
                    num = num + 90;
                    i++;
                    continue;
                }else{
                    num = num + 10;
                    continue;
                }
            }
            if(s.charAt(i) == 'C' && i != s.length()-1) {
                if(s.charAt(i+1) == 'D') {
                    num = num + 400;
                    i++;
                    continue;
                }else if(s.charAt(i+1) == 'M') {
                    num = num + 900;
                    i++;
                    continue;
                }else{
                    num = num + 100;
                    continue;
                }
            }
            if( s.charAt(i) == 'V'){
                num = num + 5;
            }else if(s.charAt(i) == 'L') {
                num = num + 50;
            }else if(s.charAt(i) == 'D') {
                num = num + 500;
            }else if(s.charAt(i) == 'M'){
                num = num + 1000;
            }else if(s.charAt(i) == 'I') {
                num++;
            }else if(s.charAt(i) == 'X') {
                num = num + 10;
            }else {
                num = num + 100;
            }
        }
        return num;
    }
}
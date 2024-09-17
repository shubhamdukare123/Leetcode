class Solution {

    boolean isNum(char ch) {
        if(ch == '0' || ch == '1' || ch == '2' ||ch == '3' ||ch == '4' ||ch == '5' ||ch == '6' ||ch == '7' ||ch == '8' ||ch == '9' ) {
            return true;
        }else {
            return false;
        }
    }

    public int myAtoi(String s) {
      s = s.trim();
      if(s.length() == 0) {
        return 0;
      }
      boolean flag = true;
      if(s.charAt(0) == '-') {
        flag = false;
      }
    long num = 0;
      for(int i=0; i<s.length(); i++) {
        char ch = s.charAt(i);
        if(i == 0 && (ch == '+' || ch == '-')) {
            continue;
        }

        if(isNum(ch)) {
            long tempNum = ch - '0';

            num = num * 10 + tempNum;
            if(num > 2147483647 && flag)
                return 2147483647;

            if(-num < -2147483648 && !flag){
            return -2147483648;
        }    

        }else{
            break;
        }
      }

      if(flag) {
            return (int)num;
      }else{

            return (int)(-num);
        
    
      }





    }
}
class Solution {

    public String gcdOfStrings(String str1, String str2) {
     int minLen;
     int maxLen;

     if(!(str1 + str2).equals(str2+str1)) {
        return "";
     }
     

     if(str1.length() < str2.length()) {
        minLen = str1.length();
        maxLen = str2.length();
        
     }else{
        minLen = str2.length();
        maxLen = str1.length();
     }

     for(int i=minLen; i>0; i--) {
        if(minLen % i == 0 && maxLen % i == 0) {
            return str1.substring(0, i);
        }
     }

     return "";

    }
}
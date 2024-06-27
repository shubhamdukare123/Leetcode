class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int minLen;
        String minStr;
        if(str1Len > str2Len) {
            minLen = str2Len;
            minStr = str2;
        }else{
            minLen = str1Len;
            minStr = str1;
        }
        
        while(minLen != 0) {
            if(str1Len % minLen == 0 && str2Len % minLen == 0) {
                String divStr = minStr.substring(0, minLen);
                String str1Temp = divStr.repeat(str1Len/minLen);
                String str2Temp = divStr.repeat(str2Len/minLen);
                if(str1Temp.equals(str1) && str2Temp.equals(str2)) {
                    return divStr;
                }                
            }
            minLen--;
        }

        return "";
    }
}
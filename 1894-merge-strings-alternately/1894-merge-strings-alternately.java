class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLen = Math.min(word1.length(), word2.length());
        String mergedStr = "";
        for(int i=0; i < minLen; i++) {
            //add characters into mergedStr
            mergedStr += word1.charAt(0);
            mergedStr += word2.charAt(0);
            //removing added char from word1 and word2

            word1 = new StringBuilder(word1).deleteCharAt(0).toString();
            word2 = new StringBuilder(word2).deleteCharAt(0).toString();

        }


        if(word1.length() > word2.length()) {
            return mergedStr + word1;
        }else if(word2.length() > word1.length()) {
            return mergedStr + word2;
        }else {
            return mergedStr;
        }
    }
}
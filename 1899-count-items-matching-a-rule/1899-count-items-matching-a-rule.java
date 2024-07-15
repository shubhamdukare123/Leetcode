class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int ruleMatchCount = 0;
     if(ruleKey.equals("type")) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).get(0).equals(ruleValue)) {
                ruleMatchCount++;
            }
        }
     }else if(ruleKey.equals("color")) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).get(1).equals(ruleValue)) {
                ruleMatchCount++;
            }
        }
     }else {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).get(2).equals(ruleValue)) {
                ruleMatchCount++;
            }
        }
     }

     return ruleMatchCount;      
    }
}
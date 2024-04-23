class Solution {
    public int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");
    int maxLength = Math.max(v1.length, v2.length);
    for(int i=0; i<maxLength; i++) {
        int v1L = i<v1.length ? Integer.parseInt(v1[i]) : 0;
        int v2L = i<v2.length ? Integer.parseInt(v2[i]) : 0;

        if(v1L == v2L) {
            continue;
        }else if(v1L < v2L) {
            return -1;
        }else {
            return 1;
        }
    }
    return 0;
    }
}
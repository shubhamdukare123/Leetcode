class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int start=0; start<s.length(); start++) {
            for(int end=start; end<s.length(); end++) {
                // substring from start to endi
                int zero_count = 0;
                int one_count = 0;
                for(int i=start; i<=end; i++) {
                    if(s.charAt(i) == '0') {
                        zero_count++;
                    }
                    if(s.charAt(i) == '1') {
                        one_count++;
                    }
                }

                if(zero_count <= k || one_count <= k) {
                    count++;
                }
            }
        }
        return count;
    }
}
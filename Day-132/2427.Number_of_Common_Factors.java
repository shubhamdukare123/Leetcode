class Solution {
    public int commonFactors(int a, int b) {
        int smallNo = Math.min(a,b);
        int factCount = 1;

        for(int i=2; i<=smallNo; i++) {
            if(a%i == 0 && b%i == 0) {
                factCount++;
            }
        }

        return factCount;
    }
}

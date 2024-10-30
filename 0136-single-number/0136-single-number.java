class Solution {
    public int singleNumber(int[] nums) {
        int retValue = 0;
        for(int i=0; i<nums.length; i++) {
            retValue ^= nums[i];
        }

        return retValue;
    }
}
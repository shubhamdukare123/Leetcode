class Solution {
    public int singleNumber(int[] nums) {
        int retValue = nums[0];

        for(int i=1; i<nums.length; i++) {
            retValue ^= nums[i];
        }

        return retValue;
    }
}
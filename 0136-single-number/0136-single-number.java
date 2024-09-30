class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            boolean elemFound = false;

            for(int j=0; j<nums.length; j++) {
                if(i==j) {
                    continue;
                }

                if(nums[i] == nums[j]) {
                    elemFound = true;
                    break;
                }
            }

            if(elemFound == false) {
                return nums[i];
            }
        }

        return 0;
    }
}
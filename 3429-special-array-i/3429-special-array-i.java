class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) {
            return true;
        }

        int i=0;
        int j=1;

        while(j<nums.length) {
            if(nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                 i++;
            j++;
                continue;
            }else if(nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                 i++;
            j++;
                continue;
            }else{
                return false;
            }

        }

        return true;
        
    }
}
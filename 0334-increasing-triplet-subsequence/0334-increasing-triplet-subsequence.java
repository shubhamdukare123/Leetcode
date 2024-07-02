class Solution {
    public boolean increasingTriplet(int[] nums) {

        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] < min) 
                min = nums[i];
            if(nums[nums.length-1-i] > max)
                max = nums[nums.length-1-i];

            leftMin[i] = min;
            rightMax[nums.length-1-i] = max;            
        }

        for(int i=1; i<nums.length-1; i++) {
            if(leftMin[i] < nums[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }

        return false;
    }
}
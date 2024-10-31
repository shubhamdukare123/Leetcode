class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        boolean targetFound = false;

        for(int i=0; i<nums.length && !targetFound; i++) {
            for(int j=i+1; j<nums.length && !targetFound; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    targetFound = true;
                }
            }
        }   

        return arr;
    }
}
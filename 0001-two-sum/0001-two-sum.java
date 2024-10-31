class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = nums.length;
        for(int i=0; i<size; i++) {

            if(hm.containsKey(nums[i])) {
                if( i == hm.get(nums[i])) {
                    continue;
                }
                return new int[]{i, hm.get(nums[i])};
            }
                hm.put(target - nums[i], i);
        } 

      /*  for(int i=0; i<size; i++) {
            if(hm.containsKey(nums[i])) {
                if( i == hm.get(nums[i])) {
                    continue;
                }
                return new int[]{i, hm.get(nums[i])};
            }
        }
        */

        return new int[]{-1,-1};
    }
}
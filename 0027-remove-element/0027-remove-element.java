import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> lst = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                lst.add(nums[i]);
            }
        } 


        for(int i=0; i<lst.size(); i++) {
            nums[i] = lst.get(i);
        }

        return lst.size();
    }
}
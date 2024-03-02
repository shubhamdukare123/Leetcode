import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        //the smallest positive no that is not present will be between 1 to n+1
        //so add in a set 
        //use contains method in a set
        //and make a loop from 1 to n+1
        //if i is not in set return i

        Set st = new TreeSet();
        for(int i=0; i<nums.length; i++){
            st.add(nums[i]);
        }
        for(int i=1; i<=nums.length+1; i++){
            if(!st.contains(i)){
                return i;
            }
        }
        return 0;
    }
}

//time complexity: O(n) + O(n) = O(n)
//space complexity: O(n)
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> lst = new LinkedList<>();

        


        HashSet<Integer> tempLst1 = new HashSet<>();
        HashSet<Integer> tempLst2 = new HashSet<>();


        for(int i=0; i<nums1.length; i++) {

            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j])
                    break;

                if(j== nums2.length-1) {
                    tempLst1.add(nums1[i]);
                }
            }
        }

        for(int i=0; i<nums2.length; i++) {

    
            for(int j=0; j<nums1.length; j++) {
                if(nums2[i] == nums1[j])
                    break;

                if(j== nums1.length-1) {
                    tempLst2.add(nums2[i]);
                }
            }
        }   
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        for(int a : tempLst1) {
            lst1.add(a);
        }
        
        for(int a : tempLst2) {
            lst2.add(a);
        }

        lst.add(lst1);
        lst.add(lst2);
        

        return lst;       
    }
}
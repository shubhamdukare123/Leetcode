class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rankCount = 1;
        for(int i=0; i<temp.length; i++) {
            if(!hm.containsKey(temp[i]))
                hm.put(temp[i], rankCount++);
        }

        for(int i=0; i<temp.length; i++) {
            temp[i] = hm.get(arr[i]);
        }
        return temp;
    }
}
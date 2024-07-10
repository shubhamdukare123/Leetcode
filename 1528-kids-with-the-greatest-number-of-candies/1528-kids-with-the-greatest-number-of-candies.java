class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i=0; i<candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> maxCandies = new ArrayList<>();

        for(int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                maxCandies.add(true);
            }else{
                maxCandies.add(false);
            }
        }

        return maxCandies;
    }
}
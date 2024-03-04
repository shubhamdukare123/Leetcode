class Solution {
    public int maxProfit(int[] prices) {

        // take a min variable and stores min values in it and check profit on min simple approach
        //not  much to explain
        //check prices[i] - min > 0 then profit 
        //so add that in maxProfit cause you have to get maxProfit in 1 transaction
        //change min to prices[i] when you add profit 
        int maxProfit = 0;
        int min = prices[0];
        for(int i=0; i<prices.length; i++){

            if(prices[i] < min){
                min = prices[i];
            }
            
            if(prices[i] - min > 0){
                maxProfit = maxProfit + prices[i] - min;
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
//time complexity: O(n)
//space complexity: O(1)
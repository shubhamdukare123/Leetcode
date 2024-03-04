class Solution {
    public int maxProfit(int[] prices) {

        /* this approach is like take two arrays and store the profit from that side in the array 
           see min from left side
           see maximun from right side
           add the maximun profit
           i need practice on this (Just got to know approach but not clearly understood..!         
         */ 

        int lProfit = 0;
        int rProfit = 0;
        int min = prices[0];
        int max = prices[prices.length-1];

        int lProfitArr[] = new int[prices.length];
        int rProfitArr[] = new int[prices.length];

        int i=0;
        int j= prices.length-1;

        while(i<prices.length && j>=0){
            if(prices[i] < min){
                min = prices[i]; 
            }
            if(prices[j] > max){
                max = prices[j];
            }
            if(prices[i] - min > lProfit){
                lProfit = prices[i] - min;
            }
            if(max - prices[j] > rProfit){
                rProfit = max - prices[j];
            }
            lProfitArr[i] = lProfit;
            rProfitArr[j] = rProfit;
            i++;
            j--;
        }
        int maxProfit = 0;
        for(int k=0; k<prices.length; k++){
            int profit = lProfitArr[k] + rProfitArr[k];
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
        
    }
}

//time complexity : O(n) + O(n) = O(2n) = O(n)
//space complexity: O(n) + (n) = O(2n) = O(n)
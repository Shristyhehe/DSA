/*Tc is O(n) and sc is O(1)
Current price = sell price
Minimum price seen so far = buy price
Profit = sell - buy
Keep maximum profit*/


class Solution{
  public static int maxProfit(int[] arr){
    //the buying price
    int minBuy = Integer.MAX_VALUE;
    int maximumProfit = 0;
    
    //current element is selling price
    
    for(int i=0; i<arr.length; i++){
      
      //we are checking if something smaller than current selling price is seen then make it as buy price
      
      minBuy = Math.min(arr[i], minBuy);
      
      //buy price is smaller than the current price then find the profit by 
      
      if(minBuy < arr[i]){
        int profit = arr[i] - minBuy;
        //returning max profit
        maximumProfit = Math.max(profit, maximumProfit);
      }
    }
    return maximumProfit;
  }
}

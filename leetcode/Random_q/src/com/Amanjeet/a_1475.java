package com.Amanjeet;

public class a_1475 {
    class Solution {
        public int[] finalPrices(int[] prices) {
            int[] out = new int[prices.length];
            for(int i=0;i<prices.length;++i){
                int price = prices[i];
                for(int j=i+1;j<prices.length;++j){
                    if(prices[j]<=price){
                        price = price-prices[j];
                        break;
                    }
                }
                out[i]=price;
            }
            return out;
        }
    }
}

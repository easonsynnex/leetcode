package com.eason.leetcode.leetcode0121;

public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int end;
        int j;
        if(prices.length <= 1){
            return result;
        }
        for (int i = 0; i < prices.length - 1; ) {
            j = i + 1;
            end = prices[j];
            while(j < prices.length  && prices[j] > prices[i]){
                if(prices[j] >= end){
                    result = (prices[j] - prices[i]) > result ? (prices[j] - prices[i]) : result ;
                    end = prices[j];
                }
                j++;
            }
            i++;
        }

        return result;
    }
    public int maxProfit2(int[] prices) {
        int result = 0;
        int start = prices[0];
        if(prices.length <= 1){
            return result;
        }
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < start){
                start = prices[i];
            }else{
                result = (prices[i] - start) > result ? (prices[i] - start) : result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit2(prices));
    }
}

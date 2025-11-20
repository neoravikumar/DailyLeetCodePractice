package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    static void main() {
        int[] input = {7, 1, 5, 3, 6, 4};
        //int[] input = {1,2,4,2,5,7,2,4,9,0,9};

        String sat = "eat";
        Arrays.sort(sat.toCharArray());
        String value = sat;
        System.out.println("eat after sorted?"+sat);

        int result = maxProfit(input);
        System.out.println(result);

    }

    public static int maxProfit(int[] prices) {
        /*int profit=0;
        int N = prices.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i< N;i++){
            for(int j= i;j<N;j++){
                profit = prices[j]-prices[i];
                max = Math.max(max, prices[j]-prices[i]);
            }
        }
        return max;*/
        // Optimal
        int left = 0, right = 1, profit = 0, max = Integer.MIN_VALUE;
        for (; right < prices.length; ) {
            if (prices[right] > prices[left]) {
                profit = prices[right] - prices[left];
                max = Math.max(max, profit);

            } else {
                left=right;
            }
            right++;
        }
        return max;
    }
}

package com.ravi.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsOfBasket {

    static void main() {

        int[] fruits = {0, 1, 2, 2};
        int result = totalFruit(fruits);
        System.out.println(result);

    }

    // LeetCode: https://leetcode.com/problems/fruit-into-baskets/submissions/1836029752/
    public static int totalFruit(int[] fruits) {
        int left = 0, maxLen = 0;
        Map<Integer, Integer> basket = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

}

package com.ravi.leetcode.twoPointer;

// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerWithMostWater {
    static void main() {
        //int[] input = {1,8,6,2,5,4,8,3,7};
        int[] input = {3,1,2,4,5};
        int result = maxArea(input);
        System.out.println(result);
    }
    public static int maxArea(int[] height) {

        int maxWater = 0;
        int start = 0;
        int end=height.length-1;
        while(start<end){
            int width = end - start;
            int h = Math.min(height[start], height[end]);
            int currentArea = width * h;
            maxWater = Math.max(maxWater, currentArea);
            if (height[start] < height[end]) {
                start++; // Move left pointer right
            } else {
                end--; // Move right pointer left
            }

        }
        return maxWater;
    }

}

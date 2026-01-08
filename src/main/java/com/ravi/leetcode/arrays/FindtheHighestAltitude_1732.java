package com.ravi.leetcode.arrays;

public class FindtheHighestAltitude_1732 {
    static void main() {
        int[] input = {-5,1,5,0,-7};
        int result = largestAltitude(input);
        System.out.println(result);
    }
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}

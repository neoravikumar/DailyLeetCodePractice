package com.ravi.leetcode.math;

import java.util.Arrays;

/*
2469. Convert the Temperature
 */
public class ConvertTheTemperature {
    static void main() {
        double[] result = convertTemperature(36.50);
        System.out.println("Result:>>"+ Arrays.toString(result));
    }
    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        double kel = celsius + 273.15;
        double fren = celsius * 1.80 + 32.00;
        result[0] = kel;
        result[1] = fren;
        return result;
    }
}

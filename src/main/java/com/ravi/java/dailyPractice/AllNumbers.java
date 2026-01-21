package com.ravi.java.dailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllNumbers {
    static void main() {
        int[] input = {3,30,34,5,9};
        String result = largestNumber(input);
        System.out.println(result);

    }

    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    // Function to find all digits from a number
    public static List<Integer> allNumber(int a, List<Integer> nums){
        while(a>0){
            int temp = a%10;
            a = a / 10;
            nums.add(temp);

        }
        return nums;
    }
}

package com.ravi.leetcode.sorting;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    static void main() {
        int result = minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6});
        System.out.println(result);
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        int n = seats.length;
        for(int i=0;i<n;i++){
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}

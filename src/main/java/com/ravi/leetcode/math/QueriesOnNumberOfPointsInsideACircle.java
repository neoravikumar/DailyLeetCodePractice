package com.ravi.leetcode.math;

/*
1828. Queries on Number of Points Inside a Circle

 */
public class QueriesOnNumberOfPointsInsideACircle {

    static void main() {
        int[][] points = new Integer([{1,3},[3,3],[5,3],[2,2]]);
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            final int xj = queries[i][0];
            final int yj = queries[i][1];
            final int rj = queries[i][2];
            int count = 0;
            for (int[] point : points) {
                final int xi = point[0];
                final int yi = point[1];
                if (squared(xi - xj) + squared(yi - yj) <= squared(rj))
                    ++count;
            }
            ans[i] = count;
        }

        return ans;
    }

    private int squared(int x) {
        return x * x;
    }

}

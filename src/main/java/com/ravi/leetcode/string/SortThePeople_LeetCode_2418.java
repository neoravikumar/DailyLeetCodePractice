package com.ravi.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople_LeetCode_2418 {
    static void main() {
        String[] result = sortPeople( new String[] {"Mary","John","Emma"}, new int[] {180,165,170});
        System.out.println(Arrays.toString(result));
    }
    public static String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> pMap = new HashMap<>();
        int index =0;
        String[] result = new String[names.length];
        for(int h : heights){
            pMap.put(h,names[index]);
            index++;
        }
        /*int[] sortedNumbers = IntStream.of(heights)
                                       .boxed()
                                       .sorted(Collections.reverseOrder())
                                       .mapToInt(i -> i)
                                       .toArray();
        for(int i=0;i<sortedNumbers.length;i++){
            String value = pMap.get(sortedNumbers[i]);
            result[i] = value;
        }*/
        Arrays.sort(heights);
        index=0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = pMap.get(heights[i]);
            index++;
        }
        return result;
    }
}

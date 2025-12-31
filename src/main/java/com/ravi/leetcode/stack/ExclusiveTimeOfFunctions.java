package com.ravi.leetcode.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {

    static void main() {
        //List<String> input = List.of("0:start:0","1:start:2","1:end:5","0:end:6");
        List<String> input = List.of("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
        int[] result = exclusiveTime(1, input);
        System.out.println(Arrays.toString(result));


    }

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            } else { // end
                result[stack.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }
        return result;
    }
}

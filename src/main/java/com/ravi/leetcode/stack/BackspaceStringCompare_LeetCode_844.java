package com.ravi.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BackspaceStringCompare_LeetCode_844 {
    static void main() {
       boolean result =  backspaceCompare("a##c","#a#c");
        System.out.println(result);
    }
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.removeLast());
        return sb.toString();
    }
}

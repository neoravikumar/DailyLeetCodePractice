package com.ravi.leetcode.stack;

import java.util.Stack;

public class ValidParenthesis {

    static void main() {
        //String input = "([}}])";
        String input = "[[]]{{{{}}}";
        boolean result = isValid(input);
        System.out.println(result);
    }
    public static boolean isValid(String s) {

        if(s.length()%2 !=0) return false;
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')'){
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else {
                    return false;
                }
            }
            else if(c=='}'){
                if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }else {
                    return false;
                }

            }
            else if(c==']'){
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}

package com.ravi.leetcode.string;

/**
 * 1678. Goal Parser Interpretation
 */
public class GoalParserInterpretation {
    static void main() {
        String s = interpret("G()()()()(al)");
        System.out.println(s);

    }
    public static String interpret(String command) {
        command = command.replace("(al)","al");
        command = command.replace("()","o");
        command = command.replace("G","G");

        return command;
    }
}

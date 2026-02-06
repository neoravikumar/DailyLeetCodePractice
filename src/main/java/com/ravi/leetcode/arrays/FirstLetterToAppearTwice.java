package com.ravi.leetcode.arrays;

public class FirstLetterToAppearTwice {
    static void main() {
        char result = repeatedCharacter("abccbaacz");
        System.out.println(result);
    }
    public static char repeatedCharacter(String s) {
        int[] frequencies = new int[26];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        int index = 'a',counter=0;
        int result = 0;
        for(int i:frequencies){
            if(i==2){
                result = counter + (int) 'a';
                break;
            }
            counter++;
        }
        return (char) result;
    }
}

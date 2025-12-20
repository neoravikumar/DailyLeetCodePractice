package com.ravi.leetcode.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestString {


    static void main() {
        List<String> inputStr = List.of("Ravi", "Aman", "february", "UnitedStateOfAmerica");
        String result = findLongestLength(inputStr);
        System.out.println(result);
        String sWord =  "This is my Life and this liFE IS good";
        findGroupedBy(sWord);
    }

    /* WAF to find the max length String from the given String array and return that string length or that particular String;

     */
    public static String findLongestLength(List<String> inputStr){
        String result = "";

        // To Count and max length String
        OptionalInt maxLengthString = inputStr.stream().mapToInt(String::length).max();
        maxLengthString.getAsInt();

        // For max length String find and return
        Optional<String> rString = inputStr.stream().max(Comparator.comparingInt(String::length));

        return rString.get();
    }

    // WAF to find the first non-repeating character from a given String
    // String s = swiss

    public static void findGroupedBy(String input){
        String sWord =  "This is my Life and this liFE IS good";
        List<String> listOfString = Arrays.asList(sWord.split(" "));
        List<String> lowerCaseStirng = listOfString.stream().map(a -> a.toLowerCase()).collect(Collectors.toUnmodifiableList());
        System.out.println(lowerCaseStirng);
        Map<String, Long> result = lowerCaseStirng.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<String, Long> k : result.entrySet()){
            System.out.println("String:Count\t"+k.getKey()+"\t:\t"+k.getValue());
        }
    }






}

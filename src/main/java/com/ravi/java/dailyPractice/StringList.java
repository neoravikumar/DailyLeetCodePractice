package com.ravi.java.dailyPractice;

import java.util.Comparator;

public class StringList {
    static void main() {
        String input = "My Name is Ravi";
        StringBuilder sb = new StringBuilder();
        for(String s : input.split(" ")){
            sb.append(new StringBuilder(s).reverse()+" ");
        }
        System.out.println(sb.toString());
        //allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        String a = "cad", w = "b";
        int result = 0;
        for(char aa:a.toCharArray()){
            for(char ww: w.toCharArray()){
                result = result ^ ( aa ^ ww);
            }
        }
        System.out.println("Result >>> "+result);
    }
}

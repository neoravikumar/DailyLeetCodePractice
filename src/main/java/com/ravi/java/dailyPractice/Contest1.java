package com.ravi.java.dailyPractice;

import java.util.List;

public class Contest1 {
    static void main() {
        int result = vowelConsonantScore("au 123");
        System.out.println(result);

    }
    public static int vowelConsonantScore(String s) {

        int vCounter=0,cCounter=0,number=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                String v = "aeiou";
                if(v.indexOf(c) != -1){
                    vCounter++;
                }else{
                    cCounter++;
                }
            }
            if(Character.isDigit(c)){
                number++;
            }

        }
        if(cCounter==0){
            return cCounter;
        }
        return (int) Math.floor(vCounter/cCounter);
    }
}

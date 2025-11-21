package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    static void main() {
        //String s = "0p$";
        String s = "A man, a plan, a canal: Panama";
       boolean sss =  isPalindrome(s);
        System.out.println(sss);
    }
    public static boolean isPalindrome(String s) {
        int start =0;
        int end = s.length()-1;
        while( start < end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
        /*List<Integer> alList = new ArrayList<>();
        for(char a = 'a'; a<'z';a++ ) alList.add((int) a);
        for(int a='0';a<='9';a++){
            alList.add(a);
        }

        s = s.toLowerCase();
        String sss= "";
        for(int i =0; i<s.length();i++){
            if(alList.contains((int)s.charAt(i))){
                sss += s.charAt(i);
            }
        }

        for(int start=0, end = sss.length()-1;end>start;start++,end--){
            if(!(sss.charAt(start)==sss.charAt(end))){
                return false;
            }
        }*/
        //return true;

    }

}

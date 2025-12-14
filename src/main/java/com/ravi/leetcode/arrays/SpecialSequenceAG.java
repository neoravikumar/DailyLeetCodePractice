package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpecialSequenceAG {
    static void main() {
        //String s = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        String s = "GAB";
        int solve = solve(s);
        System.out.println(solve);
    }

    public static int solve(String A){
        int[] suffixG = new int[A.length()];
        for(int k = A.length()-1;k>=0;k--){
            if(k==A.length()-1){
                if(A.charAt(k)  == 'G'){
                    suffixG[k]=1;
                }else{
                    suffixG[k]=0;
                }

            }
            if(k!=A.length()-1){
                if(A.charAt(k)  == 'G'){
                    suffixG[k]=suffixG[k+1]+1;
                }else{
                    suffixG[k]=suffixG[k+1];
                }

            }
        }

        int result = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A'){
                result += suffixG[i];
            }
        }
        return result;
    }
}

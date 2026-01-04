package com.ravi.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    static void main() {

        List<String> result = fizzBuzz(15);
        System.out.println(result);

    }
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            /*if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i% 3 ==0 ){
                result.add("Fizz");
            }
            else if(i% 5 ==0 ){
                result.add("Buzz");
            }
            else{
                //result.add(String.valueOf(i));
                result.add(Integer.toString(i));
            }*/
            result.add(
                    i % 15 == 0 ? "FizzBuzz" :
                            i % 5 == 0  ? "Buzz" :
                                    i % 3 == 0  ? "Fizz" :
                                            String.valueOf(i)
            );
        }
        return result;
    }
}

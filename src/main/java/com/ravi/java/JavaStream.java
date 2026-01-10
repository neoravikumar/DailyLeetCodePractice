package com.ravi.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    static void main() {
        // Flat Map Example
        List<List<Integer>> data = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> flatMap = data.stream().flatMap(List::stream).toList();
        System.out.println(flatMap);

        List<Integer> flatMapAddtwo = data.stream().flatMap(List::stream).map(k->k+2).toList();
        System.out.println("Map After addition of two:"+flatMapAddtwo);

        List<String> sentences = List.of("java is fun", "streams are powerful");
        List<String> strings = sentences.stream().flatMap(s -> Arrays.stream(s.split(" " ))).toList();

        List<Integer> list = List.of(3,2,4,10,10,45,45,33,77,18);
        List<Integer> result = list.stream()
                .peek(System.out::println)
                .filter(x -> x > 5)
                .toList();
        System.out.println(result);

        int sum = result.stream()
                .reduce(0, Integer::sum);

        int sum22 = result.stream().reduce(5,Integer::sum);
        System.out.println("SUM::\t"+sum22);

        List<Integer> sd = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("SortedList:>"+sd);

        Optional<Integer> thirdList = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println("ThirdHighest:>"+thirdList.get());

        Optional<Integer> value = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Second Highest"+value.get());

        List<Integer> allUnique = list.stream().distinct().collect(Collectors.toList());
        System.out.println("All Unique>>"+allUnique);

boolean resultrrr = list.stream().anyMatch(x-> x==33);
        System.out.println("anyMatch x ==9>> :>"+resultrrr);

        // fIND MAX
        int k = list.stream().reduce(0, Integer::max);
        System.out.println(k);

        OptionalInt kt = list.stream().mapToInt(Integer::intValue).max();
        System.out.println(kt.getAsInt());

        List<Integer>  result55 = list.stream().filter(i-> Collections.frequency(list,i)>1).distinct().collect(Collectors.toList());
        System.out.println("All Duplicate"+result55);

        long totalDuplicateCount = list.stream().filter(i -> Collections.frequency(list,i)>1).distinct().count();
        System.out.println("Total duplicate Count"+totalDuplicateCount);

        System.out.println("Original List ::>>"+list);
        List<Integer>  skipExample = list.stream().skip(2).limit(3).toList();
        System.out.println("Skipexample >>"+skipExample);

        // find minimum
       int minimumValue =  list.stream().min(Integer::compare).get();
        System.out.println("Find Minimum::>>"+minimumValue);

        list.stream().min(Integer::compare).get();




    }
}

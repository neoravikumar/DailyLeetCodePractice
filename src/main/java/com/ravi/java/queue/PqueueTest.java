package com.ravi.java.queue;

import java.util.*;

public class PqueueTest {
    static void main() {
        String s="Aabb";
        Map<Character, Integer> fMap = new HashMap<>();
        for(char ct : s.toCharArray()){
            fMap.put(ct, fMap.getOrDefault(ct,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        priorityQueue.addAll(fMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!priorityQueue.isEmpty()){
            Map.Entry<Character, Integer> mapEntry = priorityQueue.poll();
            sb.append(String.valueOf(mapEntry.getKey()).repeat(mapEntry.getValue()));
        }

        //return sb.toString();



    }
}

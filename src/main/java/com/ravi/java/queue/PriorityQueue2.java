package com.ravi.java.queue;

import java.util.*;
import java.util.stream.Collectors;

public class PriorityQueue2 {
    static void main() {
        String[] ss= {"the","day","is","sunny","the","the","the","sunny","is","is"};
        //String[] ss= {"i","love","leetcode","i","love","coding"};
        PriorityQueue<String> pqs = new PriorityQueue<>();

        for(String s: ss){
            pqs.add(s);
        }

        System.out.println(topKFrequent(ss,4));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b.compareTo(a);   // reverse lexicographical to pop largest first
            }
            return freq.get(a) - freq.get(b); // smaller frequency on top
        });

        for (String word : freq.keySet()) {
            pq.add(word);
            if (pq.size() > k) pq.poll();  // keep heap size = k
        }

        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result); // because we kept min-heap behavior
        return result;
    }

}

package com.ravi.leetcode.hashMap;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWord_LeetCode_819 {
    static void main() {

       String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
       String result = mostCommonWord(paragraph,banned);
        System.out.println(result);

    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freqMap = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;

       /* Map<String, Integer> map = new HashMap<>();
        countWords(paragraph.toLowerCase(),map);
        // Sort the Map based on value
        Map<String, Integer> sortedMapDesc = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for(String s : banned){
            if(sortedMapDesc.containsKey(s)){
                sortedMapDesc.remove(s);
            }
        }
        Optional<Map.Entry<String, Integer>> firstKey = sortedMapDesc.entrySet().stream().findFirst();
        return  firstKey.get().getKey(); */

    }
    private static void countWords(String s, Map<String, Integer> map) {
        for (String word : s.split("\\s+")) {
            String cleanedInput = word.replaceAll("[!?',;.]", "");
            map.put(cleanedInput, map.getOrDefault(cleanedInput, 0) + 1);
        }
    }
}

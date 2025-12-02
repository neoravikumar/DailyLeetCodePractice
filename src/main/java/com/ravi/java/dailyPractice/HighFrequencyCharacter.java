package com.ravi.java.dailyPractice;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighFrequencyCharacter {


    public static Optional<Character> findHighestFrequencyCharacter(String word) {
        if (word == null || word.isEmpty()) {
            return Optional.empty();
        }

        // Convert the word into a stream of characters, group them by identity,
        // and count their occurrences to create a frequency map.
        Map<Character, Long> charFrequencies = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the entry in the frequency map with the maximum count (value).
        // If multiple characters have the same highest frequency, the one encountered
        // first during stream processing will be returned.
        Optional<Map.Entry<Character, Long>> maxEntry = charFrequencies.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // Extract the character (key) from the entry with the maximum frequency.
        return maxEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        String word1 = "hello world";
        Optional<Character> highestFreqChar1 = findHighestFrequencyCharacter(word1);
        highestFreqChar1.ifPresent(c -> System.out.println("Highest frequency character in \"" + word1 + "\": " + c));

        String word2 = "programming";
        Optional<Character> highestFreqChar2 = findHighestFrequencyCharacter(word2);
        highestFreqChar2.ifPresent(c -> System.out.println("Highest frequency character in \"" + word2 + "\": " + c));

        String word3 = "aaabbc";
        Optional<Character> highestFreqChar3 = findHighestFrequencyCharacter(word3);
        highestFreqChar3.ifPresent(c -> System.out.println("Highest frequency character in \"" + word3 + "\": " + c));

        String emptyWord = "";
        Optional<Character> highestFreqCharEmpty = findHighestFrequencyCharacter(emptyWord);
        System.out.println("Highest frequency character in an empty string: " + highestFreqCharEmpty.orElse(' ')); // Prints a space if empty
    }
}


package com.ravi.leetcode.arrays;

import java.util.*;

public class GroupAnagrams {

    static void main() {
        //String[] intput = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] intput = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};
        List<List<String>> result = groupAnagrams(intput);

        String sat = "eat";

        Arrays.sort(sat.toCharArray());
        String value = sat;
        System.out.println("eat after sorted?" + sat);

        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        List<List<String>> myfinalList = new ArrayList<>();
        for (String s : strs) {
            char[] fs = s.toCharArray();
            Arrays.sort(fs);
            String sortedString = String.valueOf(fs);
            if (myMap.containsKey(sortedString)) {
                List<String> existingList = myMap.get(sortedString);
                existingList.add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                myMap.put(sortedString, newList);
            }
        }
        for (String key : myMap.keySet()) {
            myfinalList.add(myMap.get(key));
        }
        return myfinalList;
    }

    static boolean isAnagram(String s, String as) {
        int slen = s.length();
        int aslen = as.length();

        if (slen != aslen) {
            return false;
        }

        char[] achar = s.toCharArray();
        char[] aschar = as.toCharArray();
        Arrays.sort(achar);
        Arrays.sort(aschar);
        if (achar[0] == aschar[0] && achar[achar.length - 1] == aschar[aschar.length - 1]) {
            return true;
        }
        return false;
    }
}

package com.ravi.leetcode.string;

/** LC 3042. Count Prefix and Suffix Pairs I
 * https://leetcode.com/problems/count-prefix-and-suffix-pairs-i
 */
public class CountPrefixAndSuffixPairsI {
    static void main() {
        // "a","aba","ababa","aa"
        String[] input = {"a","aba","ababa","aa"};
        int result = countPrefixSuffixPairs(input);
        System.out.println(result);

        /*
        String k = "uyuyababaoiio";
        String kk = "aba";
        System.out.println(k.indexOf("aba"));

        String pfS = k.substring(0,kk.length());
        String sfS = k.substring(k.length()-kk.length());
        System.out.println(pfS+"\t\t"+sfS);
        System.out.println();
        */
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int total=0;
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(isPrefixAndSuffix(words[i],words[k])){
                    total++;
                }
            }
        }
        return total;
    }
    public static boolean isPrefixAndSuffix(String str1, String str2){
        if(str2.length()>=str1.length()) {
            String pf = str2.substring(0, str1.length());
            String sf = str2.substring(str2.length() - str1.length());
            return str1.equals(pf) && str1.equals(sf);
        }
        return false;
    }
}

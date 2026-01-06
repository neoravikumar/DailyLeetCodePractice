package com.ravi.leetcode.string;

public class ReverseWordsInAString3 {
    static void main() {
        String result = reverseWords3("Let's take LeetCode contest");
        System.out.println(result);

    }


    // Approach 1
    public static String reverseWords(String s) {
        if(s.length()==1){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        int n = s.length();
        while(end<n){
            if(s.charAt(end)==' '){
                String k = s.substring(start, end);
                StringBuilder builder = new StringBuilder(k);
                sb.append(builder.reverse());
                sb.append(" ");
                start = end+1;
                end++;
            }
            else{
                end++;
            }
            if(end==n-1){
                String k = s.substring(start, n);
                StringBuilder builder = new StringBuilder(k);
                sb.append(builder.reverse());
            }
        }
        return sb.toString();
    }

    // Approach 2
    public static String reverseWords2(String s) {
        if(s.length()==1){
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<words.length;i++){
            StringBuilder ab = new StringBuilder(words[i]);
            sb.append(ab.reverse());
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    // Approach 3
    public static String reverseWords3(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char tmp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = tmp;
        }
    }

}

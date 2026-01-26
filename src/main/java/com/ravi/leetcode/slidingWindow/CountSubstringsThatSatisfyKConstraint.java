package com.ravi.leetcode.slidingWindow;

public class CountSubstringsThatSatisfyKConstraint {
    static void main() {
        int result = countKConstraintSubstrings("11111",1);
        System.out.println(result);

    }
    public static int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int count0 = 0, count1 = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') count0++;
            else count1++;

            // shrink only when BOTH exceed k
            while (count0 > k && count1 > k) {
                if (s.charAt(left) == '0') count0--;
                else count1--;
                left++;
            }

            // all substrings ending at right are valid
            result += (right - left + 1);
        }

        return result;
        /*int n= s.length();
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String ss = s.substring(i,j);
                int parsedInt = Integer.parseInt(ss, 2);
                int noOf1 = Integer.bitCount(parsedInt);
                int noOf0 = ss.length()-noOf1;
                if(noOf1 <=k || noOf0 <=k){
                    result++;
                }

            }
        }
        return result;*/
    }
}

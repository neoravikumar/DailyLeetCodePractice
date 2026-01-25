package com.ravi.leetcode.bitwise;

public class SingleNumberII_leetCode_137 {
    static void main() {
        //int[] nums = {2,2,3,2};
        int[] nums = {0,1,0,1,0,1,99};
        int result = singleNumber(nums);
        System.out.println(result);

    }
    /*Algorithm:
    Initialize two variables, ones and twos, to 0. These variables will track the bits that have appeared once and twice, respectively.
    Iterate through the array. For each number num:
    Update twos to include bits that are set in both ones and the current num (twos |= (ones & num)).
    This identifies bits appearing a second time.
    Update ones by XORing it with num (ones ^= num). This toggles the bits based on odd occurrences.
    Calculate a common bit mask mask = ~(ones & twos) to find bits that have appeared three times.
    Remove the bits that appeared three times from both ones and twos using the mask (ones &= mask, twos &= mask).
    After iterating through all numbers, the ones variable will hold the single unique element.*/
    public static int singleNumber(int[] nums) {
        /*int ones=0, twos=0;
        for(int num : nums){
            twos |= (ones & num);
            ones ^= num;
            int mask = ~(ones & twos);
            ones &= mask;
            twos &= mask;
        }
        return ones;*/
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = (ones ^ num) & ~twos;
            twos =(twos ^ num) & ~ones;
        }
        return ones;

    }
}

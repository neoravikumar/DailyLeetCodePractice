package com.ravi.leetcode.bitwise;

import java.util.ArrayList;
import java.util.List;

// 1018. Binary Prefix Divisible By 5
//https://leetcode.com/problems/binary-prefix-divisible-by-5/description/?envType=daily-question&envId=2025-12-01
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }

        return res;
    }
}

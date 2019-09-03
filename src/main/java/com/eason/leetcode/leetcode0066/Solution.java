package com.eason.leetcode.leetcode0066;


public class Solution {

    public int[] plusOne(int[] digits){
        if(digits != null){
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] ++;
                digits[i] = digits[i] % 10;
                if(digits[i] > 0){
                    return digits;
                }
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 0;

        return digits;
    }
}
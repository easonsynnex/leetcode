package com.eason.leetcode.array.leetcode0566;


public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int count = nums.length * nums[0].length;
        if(count != r * c){
            return nums;
        }
        int[][] nNums = new int[r][c];
        int col=0;
        int raw=0;
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<nums[0].length;j++){
                nNums[col][raw] = nums[i][j];
                if(raw == c-1){
                    col++;
                    raw=0;
                }else
                    raw++;
            }
        }
        return nNums;
    }



}

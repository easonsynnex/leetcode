package com.eason.leetcode.array.leetcode0448;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missArr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                missArr.add(i + 1);
            }
        }
        return missArr;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.findDisappearedNumbers(nums));

    }


}

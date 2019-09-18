package com.eason.leetcode.array.leetcode0169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                System.out.println(i);
                result = nums[i];
                count = 1;
            }else if(nums[i] != result){
                System.out.println("!="+i);
                count--;
            }else{
                System.out.println("=="+i);
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(nums,3));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1) return false;
        Map<Integer,Integer> table = new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                if(i - table.get(nums[i]) <= k){
                    System.out.println(i);
                    return true;
                }
            }else{
                table.put(nums[i], i);
            }
        }
        return false;
    }
}

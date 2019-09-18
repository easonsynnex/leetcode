package com.eason.leetcode.DynamicPrograming.leetcode0053todo;

/**
 * @author yinsheng
 * @date 2019/9/18 0018
 * @desc
 */
public class Solution {
    public int maxSubArray(int[] nums) {

        int result = nums[0];   // 保存最大的结果
        int sum = 0;            // 保存当前的子序和

        for (int num : nums) {
            if (sum > 0) {     // sum是正数，意味着后面有机会再创新高，可以继续加
                sum += num;
            } else {           // sum是负的，还不如直接从当前位重新开始算，也比(负数+当前值)要大吧
                sum = num;
            }
            result = Math.max(result, sum);   // 每一步都更新最大值
            System.out.println(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }
}

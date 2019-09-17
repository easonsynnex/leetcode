package com.eason.leetcode.DynamicPrograming.leetcode0746;

class Solution {
    /**
     * 空间利用率最高的算法,当前阶梯的最优解F(i)只与F(i-1)和F(i-2)有关，所以只保存F(i),F(i-1),F(i-2)这3个结果
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[3];
        //保存当前阶梯F(i-2)的最优解
        dp[0] = cost[0];
        //保存当前阶梯F(i-1)的最优解
        dp[1] = cost[1];
        //保存到达当前阶梯F(i)的最优解
        dp[2] = 0;
        for(int i=2;i<=cost.length;i++){
            // 到达最后一阶耗费0
            if(i==cost.length){
                dp[2] = Math.min(dp[0],dp[1]);
            }else{
            //加上到达当前阶梯的消耗cost[i]
                dp[2] = Math.min(dp[0],dp[1]) + cost[i];
            }
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

    /**
     * 用数组保存到每一个阶梯的最优解F(i)
     * @param cost
     * @return
     */
    public int minCostClimbingStairs2(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1],dp[cost.length - 2]);
    }

    public static void main(String[] args) {
        int [] nums = {0,0,0,1};
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(nums));
    }
}
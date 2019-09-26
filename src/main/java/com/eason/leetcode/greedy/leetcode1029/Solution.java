package com.eason.leetcode.greedy.leetcode1029;


import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o2[1] - o2[0]) - (o1[1] - o1[0]);
            }
        });
        int sum = 0;
        for(int i=0;i<costs.length/2;i++){
            sum += costs[i][0];
        }
        for(int i=costs.length/2;i<costs.length;i++){
            sum += costs[i][1];
        }
        return sum;
    }


}
package org.example;

import java.util.Arrays;

public class Solution {
    public int maxIceCream (int[] costs, int coins) {
        //sort the array
        Arrays.sort(costs);
        int sum = 0;
        //iterate through the costs array
        for (int i = 0; i < costs.length; i++) {
            //subtract the cost from the total coins
            coins -= costs[i];
            //if the total is still positive or 0, add an ice cream bar
            if (coins >= 0) {
                sum++;
            } else {
                break;
            }
        }
        return sum;
    }
}

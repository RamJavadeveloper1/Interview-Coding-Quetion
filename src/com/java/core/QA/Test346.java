package com.java.core.QA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test346 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

    }

}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowest = prices[0];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}

// https://leetcode.com/problems/reduce-array-size-to-the-half/
class Solution1 {
    public int minSetSize(int[] arr) {
        int total_length_arr = arr.length;
        Map<Integer, Integer> arrMap = new TreeMap();

        for (int i = 0; i < total_length_arr; i++) {
            if (arrMap.containsKey(arr[i])) {
                arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
            } else {
                arrMap.put(arr[i], 1);
            }
        }
        
        int size = 0;

        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            for (Map.Entry<Integer, Integer> entry1 : arrMap.entrySet()) {

                if (!entry.getKey().equals(entry1.getKey())) {
//                    System.out.println("entry key :: " + entry.getKey() +
//                            " entry1 key :: " + entry1.getKey());
                    if (entry.getValue() + entry1.getValue() >= total_length_arr / 2) {
                        return size = 2;

                    } else {
                        size = 1;
                    }
                } else {
                    size = 1;
                }
            }
        }
        return size;
    }

}

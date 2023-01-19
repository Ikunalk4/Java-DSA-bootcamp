//https://leetcode.com/problems/richest-customer-wealth/
package com.Array;

public class Rich_customer_Wealth {

	public static void main(String[] args) {
		int[][] arr = { {1,5}, {7,3}, {3,5} };
		System.out.println(maximumWealth(arr));
	}
	public static int maximumWealth(int[][] accounts) {
        int sumNew = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                sum = sum + accounts[row][col];
            }
            if(sumNew < sum) {
        		sumNew = sum;
        	}
            System.out.println("sum: "+sum);
            System.out.println(sumNew);
        }
        return sumNew;
    }
}

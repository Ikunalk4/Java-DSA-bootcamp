//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package com.Array;
import java.util.Arrays;
public class Candies_count {

	public static void main(String[] args) {
		//candies = [4,2,1,1,2], extraCandies = 1 [true,false,false,false,false]
		int[] candies = {4,2,1,1,2}; 
		int n = candies.length;
		boolean[] ans = new boolean[n];
		System.out.println("Bool array: " + Arrays.toString(ans));
		int max = Integer.MIN_VALUE;
		
		int extraCandies = 1;
		for(int i=0; i< n ; i++) {
			if(candies[i] > max) {
				max = candies[i];
			}
		}
		for(int i=0; i< n;i++) {
			if(candies[i] + extraCandies >= max) {
				ans[i] = true;
			}
		}
		System.out.println(max);
		System.out.println("Bool array after cal: " + Arrays.toString(ans));
	}
}


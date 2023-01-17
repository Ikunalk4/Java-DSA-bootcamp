//https://leetcode.com/problems/concatenation-of-array/description/
package com.Array;
import java.util.*;
public class Concat_array {

	public static void main(String[] args) {
		// given array
		int[] nums = {1, 2, 3, 4, 5};
		
		// array initialization
		int[] ans = new int[2*nums.length];
		
		// function call
		concat(nums,ans);
		System.out.println(Arrays.toString(ans));
	}
	static int[] concat(int[] nums, int[] ans) {
		for(int i=0; i< nums.length; i++){
			ans[i] = nums[i];
			ans[i+nums.length] = nums[i];
		}
		return ans;
	}
}
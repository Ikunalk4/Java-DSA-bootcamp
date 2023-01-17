//https://leetcode.com/problems/build-array-from-permutation/
package com.Array;

import java.util.Arrays;
public class Array_permutation {

	public static void main(String[] args) {
		// given array 
		int[] nums = {5,0,1,2,3,4};
		// array initialization
		int[] ans = new int[nums.length];
		
		buildArray(nums,ans);
		System.out.print(Arrays.toString(ans));
	}
	public static int[] buildArray(int[] nums, int[] ans){
        for(int i=0; i< nums.length; i++){ 			
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

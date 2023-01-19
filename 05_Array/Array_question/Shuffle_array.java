//https://leetcode.com/problems/shuffle-the-array/
package com.Array;
import java.util.Arrays;
public class Shuffle_array {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7}; //[2,3,5,4,1,7].
		int n = 3;					
		shuffle(nums,n);			
	}
	public static void shuffle(int[] nums, int n) {
	        int[] result = new int[2*n];
	        
	        for (int i = 0; i < n; i++) {
	            result[2 * i] = nums[i];
	            result[2 * i + 1] = nums[n + i];
	            
	        }System.out.println(Arrays.toString(result));
    }
}

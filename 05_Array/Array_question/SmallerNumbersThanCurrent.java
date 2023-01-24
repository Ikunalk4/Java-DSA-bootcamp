//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
package com.Array;
import java.util.Arrays;
public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3}; //[4,0,1,1,3]
		
		smallerNumbersThanCurrent(nums);
	}
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
	        
	        int[] arr = new int[nums.length];
	        int count = 0;
	        for(int i = 0; i < nums.length; i++){
	            for(int j = 0; j < nums.length; j++){
	                if( nums[j] < nums[i]){
	                    count++;
	                    System.out.println("inside j loop count: "+count);
	                }
	            }
	            System.out.println("inside i loop count: "+ count);
	            arr[i] = count;
	            count = 0;
	            System.out.println(nums[i]);
	        }
	        System.out.println(Arrays.toString(arr));
	        return arr;
	    }
}
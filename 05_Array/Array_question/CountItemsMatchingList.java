//https://leetcode.com/problems/find-the-highest-altitude
package com.Array;
import java.util.*;
public class CountItemsMatchingList {

	public static void main(String[] args) {
		int[] gain =  {-4,-3,-2,-1,4,3,2};
		
		System.out.println(largestAltitude(gain));
	}
	public static int largestAltitude(int[] gain) {
      	int temp= 0, max =0;
    for(int i = 0; i< gain.length; i++ ) {
    	temp = temp + gain[i];
    	gain[i] = temp;
    	max = Math.max(max, gain[i]);
    }
   return max;
 }
}

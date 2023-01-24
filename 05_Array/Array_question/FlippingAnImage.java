//https://leetcode.com/problems/flipping-an-image/
package com.Array;

import java.util.Arrays;

public class FlippingAnImage {

	public static void main(String[] args) {
		
		int[][] image = { {1,1,0},
						  {1,0,1}, 
						  {0,0,0} };
		
		flipAndInvertImage(image);
		
	}
	public static int[][] flipAndInvertImage(int[][] image) {
		
		int[][] flip = new int[image.length][];
		int s = 0;
		int e = image.length-1;
        
		for(int row = 0; row < image.length; row++) {
			for( int col = 0; col < image[row].length; col++) {
				//System.out.println("before flip: " + image[row][col]);
				if(image[row][col] == 1) {
					image[row][col] = 0;
				}else if(image[row][col] == 0) {
					image[row][col] = 1;
				}
			}rev(image[row],s,e);
		}
		for(int[] a: image) {
			System.out.println(Arrays.toString(a));
		}
		return flip;
    }
	public static void rev(int[] arr, int s, int e) {
		
		while(s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		//System.out.println(Arrays.toString(arr));  
	}

}

package com.Array;
import java.util.*;
public class MultiDimeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//How to define multi dimensional array
		
		int[][] arr1 = new int[3][]; // its not necessary to define the column len
		
		int[][] arr2 = {
				{1,2,3}, // 0th index
				{4,5,6}, // 1st index
				{7,8,9} // 2nd index
		};
		// in 2D array if we do arr2.length func then it will give us len of rows.
		// in this case its 3.
		
		// how to take input in 2D array
		int[][] arr3 = new int[3][3];
		
		for(int row=0;row<arr3.length;row++) { // arr3.length will give row length
			// now we take every row
			for(int col=0;col<arr3[row].length;col++) {
				arr3[row][col] = sc.nextInt();
			}
		}
		// output of the array
		for(int row=0;row<arr3.length;row++) { // arr3.length will give row length
			// now we take every row
			for(int col=0;col<arr3[row].length;col++) {
				System.out.print(arr3[row][col] + " ");
			}
			System.out.println();
		}
		// another way to output 2d array
		System.out.println("Another way to print");
		
		for(int row = 0; row < arr3.length; row++) {
			System.out.println(Arrays.toString(arr3[row]));
		}
		
		// using enhanced for loop
		System.out.println("Another way to print using enhanced for loop");
		
		for(int[] a: arr3) {
			System.out.println(Arrays.toString(a));
		}

		sc.close();
	}
}

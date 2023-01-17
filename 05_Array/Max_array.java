package com.Array;
import java.util.Arrays;
public class Max_array {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 222, 3, 4, 6, 8, 12, 43, 5};
		int max1 = 0;
		Max(arr,max1);
		
//		sc.close();
		
	}
	static void Max(int[] arr, int max1) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max1) {
				max1 = arr[i];
//				System.out.println(arr[i]);
//				System.out.println("Max num: " + max1);
			}
		}System.out.println("Max num: " + max1);
	}
}
package com.Array;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 8, 12, 43, 5};
		int s = 0;
		int e = arr.length-1;
		rev(arr,s,e);

	}
	static void rev(int[] arr, int s, int e) {
		
		while(s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr));  
	}

}

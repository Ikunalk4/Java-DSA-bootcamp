package com.Array;
import java.util.Arrays;
public class Array_second {

	public static void main(String[] args) {
		int num[] = {3, 4, 5 , 6, 56};
		System.out.println(Arrays.toString(num));
		
		change(num);
		System.out.println(Arrays.toString(num));

	}
	static void change(int[] arr) {
		arr[0] = 19;
	}

}

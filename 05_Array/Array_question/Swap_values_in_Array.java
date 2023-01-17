package com.Array;
import java.util.*;
public class Swap_values_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println("Enter index1 to swap");
		int index1 = sc.nextInt();
		System.out.println("Enter index2 to swap");
		int index2 = sc.nextInt();
		
		Swap(arr,index1,index2);
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}
	static void Swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}

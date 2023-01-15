package com.Array;
import java.util.*;
public class Array_first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// integer array input and output
		
		int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));  // toString method
        
        // string array
		
		String name[] = new String[4];
		
		for(int i=0;i<name.length;i++) { // to cal. the length of an array use .length
			name[i] = sc.next();
		}
		for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
		System.out.println(Arrays.toString(name));
		
		
		// array input and output using for each loop
		int arr1[] = new int[4];
		for(int i=0; i<arr1.length;i++) {
			System.out.println("Enter a num: ");
			arr1[i] = sc.nextInt();
		}
		//for each loop
		for(int num: arr1) {
			System.out.println(num);
		}
		
	        sc.close();
	}
}

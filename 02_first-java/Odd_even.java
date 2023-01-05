//Write a program to print whether a number is even or odd, 
//also take input from the user.

package com.first_java;
import java.util.*;

public class Odd_even {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = input.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}

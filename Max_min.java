//Take 2 numbers as input and print the largest number.
package com.first_java;
import java.util.*;
public class Max_min {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first num1: ");
		int num1 = input.nextInt();
		System.out.println("Enter second num2: ");
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println("num1: " + num1 + " is bigger than " + "num2: " + num2);
		}else if(num1 < num2) {
			System.out.println("num2: " + num2 + " is bigger than " + "num1: " + num1);
		}else {
			System.out.println("Both are equal");
		}

	}

}

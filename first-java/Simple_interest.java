//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.first_java;

import java.util.*;
public class Simple_interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		int principal = input.nextInt();
		System.out.print("Enter time: ");
		int time = input.nextInt();
		System.out.print("Enter rate: ");
		int rate = input.nextInt();
		
		int Si = (principal*time*rate)/100;
		System.out.println("Simple Interest: " + Si);
		
		
		
	}

}

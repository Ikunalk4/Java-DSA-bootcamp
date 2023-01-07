package com.first_java;
import java.util.*;
public class Counting_occurence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = input.nextInt();
		System.out.println("Enter the digit whose no of occurence needs to calc: ");
		int digit = input.nextInt();
		int count = 0;
		while(num != 0) {
			int temp = num%10;
			if(temp == digit) {
				count++;
			}
			num = num/10;			
		}System.out.println("The no occurence is: " + count);
		input.close();
	}
}

//To calculate Fibonacci Series up to n numbers.
package com.first_java;
import java.util.*;
public class Fibonnaci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int nextTerm = 0;
		System.out.print("Enter a num: ");
		int n = input.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=n;++i) {
			nextTerm = num1 + num2;
			num1 = num2;
			num2 = nextTerm;
			System.out.println(nextTerm);
		}
	}
}

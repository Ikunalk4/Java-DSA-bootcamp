//Write a program to calculate perfect number
//perfect number, a positive integer that is equal to the sum of its proper divisors. 
//The smallest perfect number is 6, which is the sum of 1, 2, and 3.

package com.conditionals_loops;
import java.util.*;
public class Perfect_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int perNum = 0;
		
		for(int i=1; i<num;i++) {
			if(num % i == 0) {
				perNum += i;
			}
		}
		if(perNum == num) {
			System.out.println("Perfect num");
		}else {
			System.out.println("Not perfect num");
		}
		sc.close();
	}
}

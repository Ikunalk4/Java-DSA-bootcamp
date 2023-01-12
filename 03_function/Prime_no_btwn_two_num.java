//write a function to returns all prime numbers between two given numbers
package com.functions;
import java.util.*;
public class Prime_no_btwn_two_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive num");
		
		System.out.println("Enter first num: ");
		int first = sc.nextInt(); 
		
		System.out.println("Enter second num: ");
		int second = sc.nextInt(); 
		if(first > second) {
			int temp = second;
			second = first;
			first = temp;	
		}
		for(int j=first;j<=second;j++) {
			isPrime(j);
		}
		sc.close();
	}
	static void isPrime(int num) {
		boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num % i == 0 ) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println(num);
		}
	}
}

//write a function to calculate the total value of two integer number
package com.functions;
import java.util.*;
public class Print_sum_of_two_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int first = sc.nextInt();
		System.out.println("Enter second num: ");
		int second = sc.nextInt();
		
		int sum = printSum(first,second);
		System.out.println(sum);
		sc.close();
	}
	static int printSum(int first, int second) {
		int sum = first + second;
		return sum;
	}

}

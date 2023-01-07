// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
package com.conditionals_loops;
import java.util.*;
public class Subtract_product_and_sum_of_given_digit {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int product = 1;
		int sum = 0;
		
		while( n != 0) {
			int temp = n%10;
			product = product * temp;
			System.out.println("product: "+ product);
			sum = sum + temp;
			System.out.println("sum: "+ sum);
			n = n/10;
		}
		System.out.println("The diff is " + (product-sum));
		
	}
}

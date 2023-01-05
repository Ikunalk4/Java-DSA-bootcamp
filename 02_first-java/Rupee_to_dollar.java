//Input currency in rupees and output in USD.
package com.first_java;
import java.util.*;

public class Rupee_to_dollar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1dollar is 82.69rs
		//1 INR = 0.012095 USD
		System.out.println("Enter amount in rupee: ");
		double AmountInRupee = input.nextDouble();
		
		double AmountInDollar = 82.69 * AmountInRupee;
		System.out.println("Enter in dollar: " + AmountInDollar);
	}
}

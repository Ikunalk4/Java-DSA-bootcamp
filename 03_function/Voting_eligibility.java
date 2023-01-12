//write a function to if she/he is eligible to votes if age is greater than or equal to 18.
package com.functions;
import java.util.*;
public class Voting_eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		eligiblity(age);
		sc.close();
	}
	static int eligiblity(int age) {
		if(age >= 18) {
			System.out.println("Eligible");
		}else{
			System.out.println("Not Eligible");
		}
		return age;
	}
}

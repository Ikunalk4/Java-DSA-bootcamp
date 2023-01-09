//Find Java Program Vowel Or Consonant
package com.conditionals_loops;
import java.util.*;
public class Find_vowel_or_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char: ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Char you enter is Vowel");
		} else {
			System.out.println("Char you enter is Consonant");
		}
		sc.close();
	}
}

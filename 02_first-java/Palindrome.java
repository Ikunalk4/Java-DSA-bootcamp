//To find out whether the given String is Palindrome or not.

package com.first_java;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.next();
		
		int len = str.length();
		int i = 0, j = len-1;
		boolean palindrome = true;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				palindrome = false;
			}
			i++;
			j--;
		}
		if(palindrome==false) {
			System.out.println("The string is Not a palindrome");
		}else {
			System.out.println("The string is a palindrome");
		}
	}
}

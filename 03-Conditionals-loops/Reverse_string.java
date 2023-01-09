//Reverse A String In Java
package com.conditionals_loops;
import java.util.*;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		String rev = "";
		for(int i=(str.length()-1); i>= 0; i--) {
			char temp = str.charAt(i);
			rev = rev + temp;
			//System.out.println(rev);
		}System.out.println(rev);
		sc.close();
	}
}

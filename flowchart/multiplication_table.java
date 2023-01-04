// Take a number as input and print the multiplication table for it.

import java.util.*;
public class multiplication_table {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(num1 + " * " + i + " = " + num1*i);
		}
	}
}

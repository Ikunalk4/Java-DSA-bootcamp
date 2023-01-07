// Calculate a reverse of a number.
package com.conditionals_loops;
import java.util.*;
public class Reverse_num {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = input.nextInt();
		int rev = 0;
		while(num != 0) {
			int temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
		}System.out.println("The rev num is " +rev);
		input.close();
	}
}

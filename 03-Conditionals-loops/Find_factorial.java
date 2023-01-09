// To calculate the factorial of a number.
package com.conditionals_loops;
import java.util.*;
public class Find_factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		if(num == 0) {
		}else {
			for(int i=num;i>= 1;i--) {
				fact = fact * i;			
			}
		}
		System.out.println("factorial is " + fact);
	}
}

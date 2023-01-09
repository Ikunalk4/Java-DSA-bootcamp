// write a code to find Permutation nPr and Combination nCr

package com.conditionals_loops;
import java.util.*;
public class Permutation_and_combination {
	
	public static int factorial(int n) {
		int fact = 1;
		if(n == 0) {
		}else {
			for(int i=n;i>= 1;i--) {
				fact = fact * i;			
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n and r: " );
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int Result_nCr = factorial(n)/(factorial(r)*factorial(n-r));
		int Result_nPr = factorial(n)/factorial(n-r);
		
		System.out.println("Permutation nPr is: " + Result_nPr);
		System.out.println("Permutation nCr is: " + Result_nCr);
		sc.close();

	}
}

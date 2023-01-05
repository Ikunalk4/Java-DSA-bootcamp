
//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.*;

public class Lcm_and_hcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num1: ");
		int num2 = sc.nextInt();
		int gcd = 1;
		// GCD of num1 and num2
		
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i ==0 && num2%i == 0) {
				gcd = i;
			}
		}System.out.println("Hcf of " + num1 + " and " + num2+ " is = " + gcd);
		
		int lcm = (num1*num2)/gcd;
		
		System.out.println("LCM of " + num1 + " and " + num2+ " is = " + lcm);
		
	}
}

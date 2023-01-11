//create a function to find the Max and Min of Three Numbers in Java
package com.functions;
import java.util.*;
public class Max_and_min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int a = sc.nextInt();
		System.out.println("Enter second num: ");
		int b = sc.nextInt();
		System.out.println("Enter third num: ");
		int c = sc.nextInt();
		
		int largest = return_max(a,b,c);
		int smallest = return_min(a,b,c);
		
		System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", a,b,c, largest);
		System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", a,b,c, smallest);
		
		sc.close();

	}
		public static int return_max(int a, int b, int c) {
			int max = a;
			
			if(max<b) {
				max = b;
			}
			if(max<c) {
				max = c;
			}
			return max;
		}
		public static int return_min(int a, int b, int c) {
			int min = a;
			
			if(min>b) {
				min = b;
			}
			if(min>c) {
				min = c;
			}
			return min;
		}
}

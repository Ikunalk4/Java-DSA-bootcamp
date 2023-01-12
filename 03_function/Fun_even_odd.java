package com.functions;
import java.util.*;
public class Fun_even_odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = sc.nextInt();
		even_odd(a);
		
	}
	static void even_odd(int a) {
		if(a % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}

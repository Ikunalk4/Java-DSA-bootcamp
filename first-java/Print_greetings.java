//Take name as input and print a greeting message for that particular name.
package com.first_java;
import java.util.*;

public class Print_greetings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String name = input.nextLine();
		
		System.out.println("Hello!! " + name + " Have a nice day!!!");

	}

}

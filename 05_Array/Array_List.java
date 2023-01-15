package com.Array;

import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		//syntax
		ArrayList<Integer> list = new ArrayList<>(5);
		Scanner sc = new Scanner(System.in);
//		list.add(12);
//		list.add(1);
//		list.add(132);
//		list.add(17);
//		list.add(91);
//		
//		System.out.println(list);
//		System.out.println(list.contains(24));
//		System.out.println(list.contains(12));
//		list.set(0, 15);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		System.out.println("Enter Array element: ");
//		for(int i = 0; i<5;i++) {
//			list.add(sc.nextInt());
//		}
//		for(int i = 0; i<5;i++) {
////			System.out.println(list[i]);     //here list[i] will not going to work, instead
//			System.out.println(list.get(i)); // list.get(i) you have to use
//		}
		
		//string array list
		ArrayList<String> str = new ArrayList<>(3);
		
		str.add("Hello");
		str.add("I");
		str.add("am");
		str.add("kunal");
		
		System.out.println(str);
		
		// Multi dimensional Array
		System.out.println("Enter Multi dimensional Array element: ");
		ArrayList<ArrayList<Integer>> li = new ArrayList<>(); 
		
		// Initialization
		
		for(int i=0; i<3;i++) {
			li.add(new ArrayList<>()); //bcoz of 2D array list we have to add this
		}
		// add elements
		
		for(int i=0; i<3;i++) {
			for( int j = 0; j< 3; j++) {
				li.get(i).add(sc.nextInt());
			}
		}
		System.out.println(li);
		
	}

}

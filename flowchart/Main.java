// 1. Input a year and find whether it is a leap year or not.

public class Main {

	public static void main(String[] args) {
		int year = 2008;
		
		if(year%4 == 0) {
			if(year%100!=0) {
				System.out.println("leap year");
			}else {
				System.out.println("Not a leap year");
			}
		}else {
			System.out.println("Not a leap year");
		}
	}
}

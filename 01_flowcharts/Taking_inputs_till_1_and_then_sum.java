
//Keep taking numbers as inputs till the user enters 1,
//after that print sum of all.
import java.util.*;

public class Taking_inputs_till_1_and_then_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		while(num != 1) {
			System.out.println("Enter num: ");
			num = sc.nextInt();
			sum += num;
		}System.out.println(sum);

	}

}

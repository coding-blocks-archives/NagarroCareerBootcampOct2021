package L2_Oct23;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in) ;
		
		int n = scn.nextInt();

		int rem = n % 2;

		if (rem == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");

	}

}

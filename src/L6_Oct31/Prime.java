package L6_Oct31;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in) ;

		int n = 3;

		int flag = 0;
		int div = 2;

		while (div <= n / 2) {

			if (n % div == 0) {
				flag = 1;
				break;
			}

			div = div + 1;
		}

		if (flag == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}

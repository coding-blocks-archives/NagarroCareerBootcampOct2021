package L6_Oct31;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		int val ;

		while (row <= n) {

			val = row ;
			
			// 2 work
			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print(val + " ");
			}

			// changes
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}

}

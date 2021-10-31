package L5_Oct30;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		while (row <= 2 * n - 1) {

			// work
			for (int csp = 1; csp <= nsp; csp = csp + 1)
				System.out.print("  ");

			for (int cst = 1; cst <= nst; cst = cst + 1)
				System.out.print("* ");

			// prep
			System.out.println();

			if (row <= n - 1) {
				nsp = nsp - 1;
				nst = nst + 1;
			} else {
				nsp = nsp + 1;
				nst = nst - 1;
			}

			row = row + 1;

		}

	}

}

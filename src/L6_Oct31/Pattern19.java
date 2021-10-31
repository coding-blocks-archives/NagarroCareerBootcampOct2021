package L6_Oct31;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = n / 2 + 1;
		int nsp = -1;

		int row = 1;

		while (row <= n) {

			// work

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1)
				System.out.print("* ");

			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1)
				System.out.print("  ");

			// stars
			int cst = 1;

			if (row == 1 || row == n)
				cst = 2;

			for (; cst <= nst; cst = cst + 1)
				System.out.print("* ");

			// prep
			System.out.println();
			if (row <= n / 2) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;

		}

	}

}

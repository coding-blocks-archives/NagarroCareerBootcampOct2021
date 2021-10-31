package L5_Oct30;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		while (row <= n) {

			// 2 work
			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {

				if (cst % 2 == 0)
					System.out.print("  ");
				else
					System.out.print("* ");
			}

			// changes
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}

}

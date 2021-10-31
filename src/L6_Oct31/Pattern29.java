package L6_Oct31;

import java.util.Scanner;

public class Pattern29 {

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
				System.out.print("\t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {

				if (cst == 1 || cst == nst)
					System.out.print(row + "\t");
				else
					System.out.print("0\t");
			}

			// changes
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}

}

package L6_Oct31;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		int val;

		while (row <= n) {

			// as soon as you enter a new row, keep val equal to your row no.
			val = row;

			// 2 work
			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("\t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print(val + "\t");

				if (cst <= nst / 2)
					val = val + 1;
				else
					val = val - 1;
			}

			// changes
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}

}

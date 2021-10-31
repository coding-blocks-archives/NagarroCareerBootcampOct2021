package L6_Oct31;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int val = 1;

		int row = 1;

		while (row <= 2 * n - 1) {

			// stars work
			for (int cst = 1; cst <= nst; cst = cst + 1) {

				if (cst % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(val + " ");
			}

			// update
			System.out.println();

			if (row <= n - 1) {
				val = val + 1;
				nst = nst + 2;
			} else {
				val = val - 1;
				nst = nst - 2;
			}

			row = row + 1;

		}

	}

}

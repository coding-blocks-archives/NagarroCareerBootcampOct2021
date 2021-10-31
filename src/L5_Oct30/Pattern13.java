package L5_Oct30;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nst = 1;

		while (row <= 2 * n - 1) {

			// work
			for (int cst = 1; cst <= nst; cst = cst + 1)
				System.out.print("* ");

			// changes
			System.out.println();

			if (row <= n - 1)
				nst = nst + 1;
			else
				nst = nst - 1;
			
			row = row + 1 ;
			
			
		}

	}

}

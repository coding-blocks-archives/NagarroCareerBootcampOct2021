package L4_Oct29;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		int nst = n;

		// go to every row
		while (row <= n) {

			// work : stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			
			// changes
			System.out.println();
			row = row + 1 ;
			nst = nst - 1 ;

		}

	}

}

package L5_Oct30;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		// loop for every row
		while (row <= n) {

			// work in every row
			for (int col = 1; col <= n; col = col + 1) {

				if (row == col || row + col == n + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			// changes
			System.out.println();
			row = row + 1;

		}

		scn.close();

	}

}

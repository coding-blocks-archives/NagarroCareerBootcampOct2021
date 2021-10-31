package L6_Oct31;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int val;

		// loop for every row
		while (row <= n) {

			val = n;

			// work in every row
			for (int col = 1; col <= n; col = col + 1) {
				System.out.print(val + " ");
				val = val - 1;
			}

			// changes
			System.out.println();
			row = row + 1;

		}

		scn.close();

	}

}

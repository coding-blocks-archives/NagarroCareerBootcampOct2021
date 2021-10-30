package L4_Oct29;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		// loop for every row
		while (row <= n) {

			// work in every row
			for (int col = 1; col <= n; col = col + 1) {
				System.out.print("* ");
			}
			
			// int col = 1 ;
			// while(col <= n) {
			//	System.out.print("*");
			//	col = col + 1 ;
			//}
			
			// changes
			System.out.println();
			row = row + 1;

		}

		scn.close();

	}

}

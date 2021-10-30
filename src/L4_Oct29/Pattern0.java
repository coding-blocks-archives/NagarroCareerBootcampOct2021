package L4_Oct29;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		
		int row = 1 ;
		
		// go to every row and do some work
		while (row <= n) {
			
			// work in every row
			System.out.print("*");
			
			// changes
			System.out.println();
			row = row + 1 ;
			
		}
		
		

	}

}

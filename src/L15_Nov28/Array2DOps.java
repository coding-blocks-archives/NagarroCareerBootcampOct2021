package L15_Nov28;

import java.util.Scanner;

public class Array2DOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// int[][] arr = takeInput();
//		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
//				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
//
//		display(arr);
//		spiralDisplay(arr);

		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int[][] ans = matrixMultiplication(one, two);
		display(ans);

	}

	public static int[][] takeInput() {

		System.out.println("Rows ?");
		int rows = scn.nextInt();
		System.out.println("Cols ?");
		int cols = scn.nextInt();

		int[][] arr = new int[rows][cols];

		for (int r = 0; r < arr.length; r = r + 1) {

			for (int c = 0; c < arr[0].length; c = c + 1) {

				System.out.print("arr[" + r + "][" + c + "] ?");
				arr[r][c] = scn.nextInt();
			}

		}

		return arr;

	}

	public static void display(int[][] arr) {

		for (int r = 0; r < arr.length; r = r + 1) {

			for (int c = 0; c < arr[0].length; c = c + 1) {
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();

		}

	}

	public static void waveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c = c + 1) {

			if (c % 2 == 0) {

				// downward direction
				for (int r = 0; r < arr.length; r = r + 1) {
					System.out.print(arr[r][c] + " ");
				}

			} else {

				// upward direction
				for (int r = arr.length - 1; r >= 0; r = r - 1) {
					System.out.print(arr[r][c] + " ");
				}

			}
		}

		System.out.println();
	}

	public static void spiralDisplay(int[][] arr) {

		int minrow = 0;
		int maxrow = arr.length - 1;

		int mincol = 0;
		int maxcol = arr[0].length - 1;

		int total = arr.length * arr[0].length;
		int count = 0;

		while (count < total) {

			// first col
			for (int row = minrow; row <= maxrow && count < total; row = row + 1) {
				System.out.print(arr[row][mincol] + " ");
				count = count + 1;
			}
			mincol = mincol + 1;

			// last row
			for (int col = mincol; col <= maxcol && count < total; col = col + 1) {
				System.out.print(arr[maxrow][col] + " ");
				count = count + 1;
			}
			maxrow = maxrow - 1;

			// last col
			for (int row = maxrow; row >= minrow && count < total; row = row - 1) {
				System.out.print(arr[row][maxcol] + " ");
				count = count + 1;
			}
			maxcol = maxcol - 1;

			// first row
			for (int col = maxcol; col >= mincol && count < total; col = col - 1) {
				System.out.print(arr[minrow][col] + " ");
				count = count + 1;
			}
			minrow = minrow + 1;
		}

	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		int[][] res = new int[r1][c2];

		// using this loop you will visit every cell of the res array
		for (int r = 0; r < res.length; r = r + 1) {

			for (int c = 0; c < res[0].length; c = c + 1) {

				int sum = 0;

				for (int k = 0; k < c1; k = k + 1) {
					sum = sum + one[r][k] * two[k][c];
				}

				res[r][c] = sum;

			}

		}

		return res;

	}
}

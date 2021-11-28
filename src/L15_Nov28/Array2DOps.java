package L15_Nov28;

import java.util.Scanner;

public class Array2DOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] arr = takeInput();
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		display(arr);
		waveDisplay(arr);
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

}

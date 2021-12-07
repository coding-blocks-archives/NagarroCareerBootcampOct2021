package Assignments.Dec7;

import java.util.Scanner;

public class PainterPartition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int nop = scn.nextInt();
		int nob = scn.nextInt();

		int[] board = new int[nob];

		for (int i = 0; i < board.length; i = i + 1) {
			board[i] = scn.nextInt();
		}

		// logic ...
		int lo = 0;
		int hi = 0;

		for (int val : board)
			hi = hi + val;

		int finalAns = 0;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(board, nop, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] board, int nop, int mid) {

		int painters = 1;
		int timeTaken = 0;

		int i = 0;

		while (i < board.length) {

			if (timeTaken + board[i] <= mid) {
				timeTaken = timeTaken + board[i];
				i = i + 1;
			} else {
				painters = painters + 1;
				timeTaken = 0;

				if (painters > nop)
					return false;
			}

		}

		return true;
	}

}

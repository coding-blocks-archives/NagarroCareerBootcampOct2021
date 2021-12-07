package Assignments.Dec7;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		for (int ptc = 1; ptc <= tc; ptc++) {
			
			int nob = scn.nextInt();
			int nos = scn.nextInt();

			int[] pages = new int[nob];

			for (int i = 0; i < pages.length; i = i + 1) {
				pages[i] = scn.nextInt();
			}

			// logic ...
			int lo = 0;
			int hi = 0;

			for (int val : pages)
				hi = hi + val;

			int finalAns = 0;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(pages, nos, mid)) {
					finalAns = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}

			}

			System.out.println(finalAns);
		}

	}

	public static boolean isItPossible(int[] pages, int nos, int mid) {

		int students = 1;
		int pagesRead = 0;

		int i = 0;

		while (i < pages.length) {

			if (pagesRead + pages[i] <= mid) {
				pagesRead = pagesRead + pages[i];
				i = i + 1;
			} else {
				students = students + 1;
				pagesRead = 0;

				if (students > nos)
					return false;
			}

		}

		return true;
	}

}

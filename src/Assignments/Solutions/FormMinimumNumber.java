package Assignments.Solutions;

import java.util.Scanner;

public class FormMinimumNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			
			int count = 1;

			String str = scn.next();
			int[] ans = new int[str.length() + 1];

			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {

					ans[i] = count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
						ans[j] = count++;
					}

				}

			}

			for (int val : ans) {
				System.out.print(val);
			}
			System.out.println();
			tc--;
		}

	}

}

package L8_Nov13;

import java.util.Scanner;

public class VonNeuman {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		for (int i = 1; i <= tc; i = i + 1) {
			
			int n = scn.nextInt();

			int mult = 1; // 2 ^ 0

			int ans = 0;

			while (n != 0) {

				int rem = n % 10;

				ans = ans + rem * mult;

				mult = mult * 2;
				n = n / 10;

			}

			System.out.println(ans);
			
		}

	}

}

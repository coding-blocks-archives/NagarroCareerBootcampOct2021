package L21_Dec12;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();

		// System.out.println("hello");
		// PDI(3);
		// System.out.println(factorial(n)) ;
		System.out.println(power(x, n));
		// System.out.println("bye");

	}

	// Bigger Problem
	public static void PD(int n) {

		// Base Case
		if (n == 0)
			return;

		// Work
		System.out.println(n);

		// Smaller Problem
		PD(n - 1);

	}

	public static void PI(int n) {

		if (n == 0)
			return;

		PI(n - 1); // 1 2 3 .... n-1

		System.out.println(n); // n
	}

	public static void PDI(int n) {

		if (n == 0) {
			return;
		}

		System.out.println("hii " + n);
		PDI(--n);
		System.out.println("bye " + n);

	}

	// BP : n!
	public static int factorial(int n) {

		// Base Case
		if (n == 0)
			return 1;

		// SP : (n-1)!
		int fnm1 = factorial(n - 1);

		// Work : SP -> BP
		int fn = fnm1 * n;

		return fn;

	}

	public static int power(int x, int n) {

	}
}

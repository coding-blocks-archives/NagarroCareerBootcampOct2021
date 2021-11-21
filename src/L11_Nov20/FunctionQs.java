package L11_Nov20;

import java.util.Scanner;

public class FunctionQs {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int ll = scn.nextInt();
		int ul = scn.nextInt();

		printAllArmstrong(ll, ul);

	}

	public static void printAllPrimes(int ll, int ul) {

		// loop from lower limit to upper limit
		for (int n = ll; n <= ul; n = n + 1) {

			boolean res = isPrime(n);

			if (res == true)
				System.out.println(n);

		}

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {

			if (n % div == 0)
				return false;

			div = div + 1;

		}

		return true;

	}

	public static void printAllArmstrong(int ll, int ul) {

		for (int n = ll; n <= ul; n = n + 1) {

			int nod = digits(n);
			boolean res = isArmstrong(n, nod);

			if (res == true)
				System.out.println(n);
		}
	}

	public static int digits(int n) {

		int count = 0;

		while (n != 0) {
			count = count + 1;
			n = n / 10;
		}

		return count;
	}

	public static boolean isArmstrong(int n, int nod) {

		int ans = 0;

		int temp = n;

		while (n != 0) {

			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}

		if (ans == temp)
			return true;
		else
			return false;
	}

}

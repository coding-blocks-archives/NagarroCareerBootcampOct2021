package Assignments.Dec15;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		for (int ptc = 1; ptc <= tc; ptc = ptc + 1) {
			
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			// logic ...
			// case 1
			int ceNotWrap = kadane(arr);

			// case 2
			int totalSum = 0;

			for (int i = 0; i < arr.length; i++) {
				totalSum = totalSum + arr[i];
				arr[i] = -arr[i];
			}

			int nceSum = kadane(arr);
			int ceWrap = totalSum + nceSum;

			int ans = Math.max(ceNotWrap, ceWrap);

			System.out.println(ans);
		}

	}

	public static int kadane(int[] arr) {

		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i = i + 1) {

			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max)
				max = sum;

		}

		return max;

	}

}

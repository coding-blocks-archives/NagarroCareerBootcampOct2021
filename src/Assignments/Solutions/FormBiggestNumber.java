package Assignments.Solutions;

import java.util.*;

public class FormBiggestNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			bubbleSort(arr);

			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();

			tc--;
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int count = 0; count <= arr.length - 2; count++) {
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (compare(arr[j], arr[j + 1]) < 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static int compare(int num1, int num2) {

		String s1 = "" + num1 + num2;
		String s2 = "" + num2 + num1;

		if (s1.compareTo(s2) >= 0) {
			return 1;
		} else {
			return -1;
		}

	}

}
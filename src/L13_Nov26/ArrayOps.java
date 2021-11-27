package L13_Nov26;

import java.util.Scanner;

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] arr = takeInput();
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		display(arr);
		System.out.println(maximum(arr));
		System.out.println(linearSearch(arr, 100));
		System.out.println(binarySearch(arr, 700));
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i = i + 1) {
			System.out.println("arr[" + i + "] ?");
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		System.out.println("----------------");

		for (int i = 0; i < arr.length; i = i + 1) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------");

	}

	public static int maximum(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i = i + 1) {

			if (arr[i] > max)
				max = arr[i];
		}

		return max;
	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i = i + 1) {

			if (arr[i] == item)
				return i;

		}

		return -1;

	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] < item)
				lo = mid + 1;
			else if (arr[mid] > item)
				hi = mid - 1;
			else
				return mid;

		}

		return -1;

	}

}

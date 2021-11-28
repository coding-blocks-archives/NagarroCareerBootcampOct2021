package L13_Nov26;

import java.util.Scanner;

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] arr = takeInput();
		// int[] arr = { 10, 20, 30, 40, 50, 60 };
		int[] arr = { 10, 20, 30, 40 };
		display(arr);
//		System.out.println(maximum(arr));
//		System.out.println(linearSearch(arr, 100));
//		System.out.println(binarySearch(arr, 700));

//		int[] newarr = rotate2(arr, -4);
//		display(newarr);

//		display(rotate2a(arr, -4));
//		rotate2b(arr, -4);
//		display(arr);

//		int[] ans = inverse(arr);
//		display(ans);

		// display(inverse(arr)) ;

		// barGraph(arr);

		// subarrayPrint(arr);
		maxSubarraySum2Loops(arr);

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

	public static void rotate1(int[] arr, int rot) {

		rot = rot % arr.length;

		if (rot < 0)
			rot = rot + arr.length;

		for (int r = 1; r <= rot; r = r + 1) {

			// single rotation
			int temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i = i - 1)
				arr[i] = arr[i - 1];

			arr[0] = temp;
		}

	}

	public static int[] rotate2a(int[] arr, int rot) {

		rot = rot % arr.length;

		if (rot < 0)
			rot = rot + arr.length;

		int[] na = new int[arr.length];

		for (int i = 0; i < arr.length; i = i + 1) {

			if (i <= rot - 1)
				na[i] = arr[i + arr.length - rot];
			else
				na[i] = arr[i - rot];

		}

		return na;
	}

	public static void rotate2b(int[] arr, int rot) {

		rot = rot % arr.length;

		if (rot < 0)
			rot = rot + arr.length;

		int[] na = new int[arr.length];

		for (int i = 0; i < arr.length; i = i + 1) {

			if (i <= rot - 1)
				na[i] = arr[i + arr.length - rot];
			else
				na[i] = arr[i - rot];

		}

		// copy the values of new array to original array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = na[i];
		}
	}

	public static int[] inverse(int[] arr) {

		int[] na = new int[arr.length];

		for (int i = 0; i < na.length; i++) {
			na[arr[i]] = i;
		}

		return na;
	}

	public static void barGraph(int[] arr) {

		int ht = maximum(arr);

		for (int row = 1; row <= ht; row = row + 1) {

			for (int col = 0; col < arr.length; col = col + 1) {

				if (row <= ht - arr[col])
					System.out.print("  ");
				else
					System.out.print("* ");

			}

			System.out.println();
		}

	}

	public static void subarrayPrint(int[] arr) {

		for (int si = 0; si < arr.length; si = si + 1) {

			for (int ei = si; ei < arr.length; ei = ei + 1) {

				for (int k = si; k <= ei; k = k + 1) {
					System.out.print(arr[k] + " ");
				}

				System.out.println();
			}
		}

	}

	public static void subarraySum(int[] arr) {

		for (int si = 0; si < arr.length; si = si + 1) {

			for (int ei = si; ei < arr.length; ei = ei + 1) {

				int sum = 0;
				for (int k = si; k <= ei; k = k + 1) {
					sum = sum + arr[k];
				}

				System.out.println(sum);
			}
		}

	}

	public static void subarraySum2Loops(int[] arr) {

		for (int si = 0; si < arr.length; si = si + 1) {

			int sum = 0;

			for (int ei = si; ei < arr.length; ei = ei + 1) {
				sum = sum + arr[ei];
				System.out.println(sum);
			}
		}

	}

	public static void maxSubarraySum2Loops(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int si = 0; si < arr.length; si = si + 1) {

			int sum = 0;

			for (int ei = si; ei < arr.length; ei = ei + 1) {
				sum = sum + arr[ei];

				if (sum > max)
					max = sum;

			}
		}

		System.out.println(max);

	}

}

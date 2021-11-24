package L12_Nov21;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = null;
		System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);

		// get / obtain
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// update
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get / obtain
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// length
		System.out.println(arr.length);

		// new reference
		int[] other = arr;

		// other[3] = 100;
		System.out.println(arr[3]);

		// for loop
		for (int i = 0; i <= arr.length - 1; i = i + 1) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i = i + 1) {
			System.out.println(arr[i]);

			// you can make changes in the array using this loop
			// arr[i] = 100;
		}

		// enhanced for loop
		System.out.println("-- EFL --");

		for (int val : arr) {
			System.out.println(val);

			// you won't be able to make changes in array using EFL
			val = 100;
		}

		// Case 1
		int i = 0, j = 3;
		System.out.println(arr[i] + " " + arr[j]);
		swap(arr[i], arr[j]);
		System.out.println(arr[i] + " " + arr[j]);

		// Case 2
		System.out.println(arr[i] + " " + arr[j]);
		// swap(arr, i, j);
		System.out.println(arr[i] + " " + arr[j]);

		// Case 3
//		int[] another = new int[3] ;
//		another[0] = 100 ;
//		another[1] = 200 ;
//		another[2] = 300 ;

		int[] another = { 100, 200, 300 };

		System.out.println(arr[0] + " " + another[0]);
		swap1(arr, another);
		System.out.println(arr[0] + " " + another[0]);

	}
	
	public static void swap1(int[] one, int[] two) {

		int temp = one[0] ;
		one[0] = two[0] ;
		two[0] = temp ;
	}


	public static void swap(int[] one, int[] two) {

		int[] temp = one ;
		one = two ;
		two = temp ;
	}

	public static void swap(int[] a, int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void swap(int one, int two) {

		int temp = one;
		one = two;
		two = temp;
	}

}

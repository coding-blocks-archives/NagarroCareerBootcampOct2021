package L23_Dec18;

public class ArrayRecursion {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		displayArray(arr, 0);

	}

	// idx -> end
	// 10 20 30 40 50
	public static void displayArray(int[] arr, int idx) {

		if (idx == arr.length)
			return;

		// idx element
		// 10
		System.out.print(arr[idx] + " ");

		// idx + 1 -> end
		// 20 30 40 50
		displayArray(arr, idx + 1);

	}

}

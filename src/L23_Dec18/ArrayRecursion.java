package L23_Dec18;

public class ArrayRecursion {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 80, 15, 30, 60 };
		System.out.println(lastOcc(arr, 0, 30));

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

	// 50 40 30 20 10
	public static void reverseDisplayArray(int[] arr, int idx) {

		if (idx == arr.length)
			return;

		// 50 40 30 20
		reverseDisplayArray(arr, idx + 1);

		// 10
		System.out.print(arr[idx] + " ");

	}

	public static int maxArray(int[] arr, int idx) {

		if (idx == arr.length)
			return Integer.MIN_VALUE;

		// idx + 1 -> end max
		int spmax = maxArray(arr, idx + 1);

		// max (sp max , arr[idx])
		int bpmax = Math.max(arr[idx], spmax);

		return bpmax;

	}

	public static int firstOcc(int[] arr, int idx, int item) {

		if (idx == arr.length)
			return -1;

		if (arr[idx] == item) {
			return idx;
		}

		return firstOcc(arr, idx + 1, item);

	}

	public static int lastOcc(int[] arr, int idx, int item) {

		if (idx == arr.length)
			return -1;

		int sp = lastOcc(arr, idx + 1, item) ;
				
		if (arr[idx] == item && sp == -1) {
			return idx ;
		}

		return sp;

	}

}







package Assignments.Solutions;

public class SubsetTarget {

	public static void main(String[] args) {

		int val = subsetInt(new int[] { 1, 2, 3 }, 0, 0, "", 3);
		System.out.println(val);
		subset(new int[] { 1, 2, 3 }, 0, 0, "", 3);

	}

	public static void subset(int[] arr, int idx, int sum, String asf, int target) {

		if (sum == target) {
			System.out.print(asf + " ");
			return;
		}

		if (idx == arr.length) {
			return;
		}

		subset(arr, idx + 1, sum + arr[idx], asf + " " + arr[idx], target); // YES
		subset(arr, idx + 1, sum, asf, target); // NO

	}

	public static int subsetInt(int[] arr, int idx, int sum, String asf, int target) {

		if (sum == target) {
			return 1;
		}

		if (idx == arr.length) {
			return 0;
		}

		int yes = subsetInt(arr, idx + 1, sum + arr[idx], asf + " " + arr[idx], target); // YES
		int no = subsetInt(arr, idx + 1, sum, asf, target); // NO

		return yes + no;
	}
}

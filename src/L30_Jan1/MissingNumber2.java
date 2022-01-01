package L30_Jan1;

public class MissingNumber2 {

	public static void main(String[] args) {

		int n = 6;
		int[] arr = { 1, 4, 3, 6 };

		int xor = 0;

		for (int i = 1; i <= n; i++)
			xor = xor ^ i;

		for (int val : arr)
			xor = xor ^ val;

		int rmsbMask = xor & (-xor);

		int n1 = 0;
		int n2 = 0;

		for (int val = 1; val <= n; val++) {
			
			// bit 0
			if ((val & rmsbMask) == 0) {
				n1 = n1 ^ val;
			}
			// bit 1
			else {
				n2 = n2 ^ val;
			}
		}

		for (int val : arr) {

			// bit 0
			if ((val & rmsbMask) == 0) {
				n1 = n1 ^ val;
			}
			// bit 1
			else {
				n2 = n2 ^ val;
			}

		}

		System.out.println(n1 + ", " + n2);
	}

}

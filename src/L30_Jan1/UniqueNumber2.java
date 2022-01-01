package L30_Jan1;

public class UniqueNumber2 {

	public static void main(String[] args) {

		int[] arr = { 36, 50, 24, 56, 36, 24, 42, 50 };

		int xor = 0;

		for (int val : arr)
			xor ^= val;

		int rmsbMask = xor & (-xor);

		int n1 = 0;
		int n2 = 0;

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

package L30_Jan1;

public class PowerOf2 {

	public static void main(String[] args) {

		int n = 0;

		if (n != 0 && (n & n - 1) == 0) {
			System.out.println("Power of 2");
		} else {
			System.out.println("Not a Power of 2");
		}

	}

}

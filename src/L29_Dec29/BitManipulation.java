package L29_Dec29;

public class BitManipulation {

	public static void main(String[] args) {

		// operators();
		// ithBitCheck(101, 3);
		noSetBits(20);
	}

	public static void operators() {

		int x = 20 | 40;
		System.out.println(x);

		int y = 36 & 40;
		System.out.println(y);

		int z = 36 ^ 40;
		System.out.println(z);

		int a = 20;
		System.out.println(a << 1);
		System.out.println(a << 2);
		System.out.println(a << 3);

		int b = 100;
		System.out.println(b >> 1);
		System.out.println(b >> 2);
		System.out.println(b >> 3);

		int c = 35;
		System.out.println(~c);

		System.out.println(~c + 1);
		System.out.println(-c);
	}

	public static void ithBitOn(int n, int i) {

		int mask = 1 << i;
		int ans = n | mask;

		System.out.println(ans);
	}

	public static void ithBitOff(int n, int i) {

		int mask = ~(1 << i);
		int ans = n & mask;

		System.out.println(ans);
	}

	public static void ithBitToggle(int n, int i) {

		int mask = 1 << i;
		int ans = n ^ mask;

		System.out.println(ans);
	}

	public static void ithBitCheck(int n, int i) {

		int mask = 1 << i;
		int ans = n & mask;

		if (ans == 0)
			System.out.println("off");
		else
			System.out.println("on");
	}

	public static void noSetBits(int n) {

		int count = 0;
		
		int mask = 1;

		while (n != 0) {

			if ((n & mask) != 0)
				count++;

			n = n >> 1;
		}
		
		System.out.println(count);

	}

}

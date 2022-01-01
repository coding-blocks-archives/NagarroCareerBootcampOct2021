package L30_Jan1;

public class MissingNumber1 {

	public static void main(String[] args) {

		int n = 7;
		int[] arr = { 1, 2, 3, 6, 7, 5 };

		int ans = 0;

		for (int i = 1; i <= n; i++)
			ans = ans ^ i;

		for (int val : arr)
			ans = ans ^ val;

		System.out.println(ans);
	}

}

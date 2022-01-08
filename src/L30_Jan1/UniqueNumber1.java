package L30_Jan1;

public class UniqueNumber1 {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 25, 15, 60, 25, 10 };

		int ans = 0;

		for (int val : arr)
			ans = ans ^ val;

		System.out.println(ans);
	}

}

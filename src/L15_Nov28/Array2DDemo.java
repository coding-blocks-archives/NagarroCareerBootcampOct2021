package L15_Nov28;

public class Array2DDemo {

	public static void main(String[] args) {

		// 2D Array
		int[][] arr = null;
		System.out.println(arr);

		arr = new int[3][5];
		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr.length); // rows
		System.out.println(arr[0].length); // cols

		// Jagged Array
		System.out.println("---- JA ----");
		int[][] jarr = new int[3][];

		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		jarr[0] = new int[2];
		jarr[1] = new int[6];
		jarr[2] = new int[3];

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		System.out.println(jarr.length);
		System.out.println(jarr[0].length);
		System.out.println(jarr[1].length);
		System.out.println(jarr[2].length);

	}

}

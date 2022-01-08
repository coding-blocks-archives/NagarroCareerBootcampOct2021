package Assignments.Solutions;

public class MazePathD2 {

	public static void main(String[] args) {

		int res = maze(0, 0, 2, 2, "");
		System.out.println();
		System.out.println(res);
	}

	public static int maze(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += maze(cr + 1, cc, er, ec, ans + "V");
		count += maze(cr, cc + 1, er, ec, ans + "H");

		if (cr == cc || (cr + cc) == er)
			count += maze(cr + 1, cc + 1, er, ec, ans + "D");

		return count;
	}

}

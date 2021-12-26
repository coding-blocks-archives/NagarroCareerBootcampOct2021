package L25_Dec24;

import java.util.ArrayList;

public class Recursion {

	public static void main(String[] args) {

		// subsequencesAscii("ab", "");
		// KPC("1453", "");
		// KPCIterative("1453");
		// coinToss(3, "");
		climbingStairs(0, 5, "");
	}

	// abc , _
	public static void subsequences(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0); // a
		String roq = ques.substring(1); // bc

		// No
		subsequences(roq, ans); // bc , _

		// Yes
		subsequences(roq, ans + ch); // bc , a

	}

	public static void subsequencesAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subsequencesAscii(roq, ans); // No
		subsequencesAscii(roq, ans + ch); // Yes
		subsequencesAscii(roq, ans + (int) ch); // Ascii

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	// "145" , _
	public static void KPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0); // 1
		String roq = ques.substring(1); // 45

		String code = getCode(ch); // abc

		for (int i = 0; i < code.length(); i++) { // 0 1 2
			KPC(roq, ans + code.charAt(i));
		}

	}

	public static void KPCIterative(String ques) {

		ArrayList<String> list = new ArrayList<>();
		list.add("");

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String code = getCode(ch);

			ArrayList<String> nl = new ArrayList<>();

			for (String val : list) {

				for (int j = 0; j < code.length(); j++) {

					nl.add(val + code.charAt(j));
				}
			}

			list = nl;

		}

		System.out.println(list);

	}

	public static void coinToss(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		coinToss(n - 1, ans + "H");
		coinToss(n - 1, ans + "T");
	}

	public static void climbingStairs(int curr, int end, String ans) {

		if (curr == end) {
			System.out.println(ans);
			return;
		}

		if (curr + 1 <= end)
			climbingStairs(curr + 1, end, ans + "1");

		if (curr + 2 <= end)
			climbingStairs(curr + 2, end, ans + "2");

		if (curr + 3 <= end)
			climbingStairs(curr + 3, end, ans + "3");

	}
}





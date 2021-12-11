package L19_Dec10;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// String str = scn.nextLine();
		// printChars(str);
		// System.out.println(substrings(str));
		// System.out.println(palindrome(str));
		// palindromicSubstrings(str);

		// System.out.println(reverseWords(str));

		// String str = "hello";
		// str = str.replace('l', 'w');
		// System.out.println(str);
		
		long start = System.currentTimeMillis() ;
		appendString(); 
		long end = System.currentTimeMillis() ;
		
		System.out.println(end-start);

	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i = i + 1) {

			char ch = str.charAt(i);
			System.out.println(ch);
		}

	}

	public static ArrayList<String> substrings(String str) {

		ArrayList<String> list = new ArrayList<>();

		for (int si = 0; si < str.length(); si = si + 1) {

			for (int ei = si + 1; ei <= str.length(); ei = ei + 1) {

				String ans = str.substring(si, ei);
				list.add(ans);
			}
		}

		return list;

	}

	public static boolean palindrome(String str) {

		int lo = 0; // 0
		int hi = str.length() - 1; // 6

		while (lo <= hi) { // 0 <= 6 , 1 <= 5 , 2 <= 4 , 3 <= 3 , 4 <= 2

			if (str.charAt(lo) != str.charAt(hi)) { // n,n i,i a,a i,i
				return false;
			}

			lo = lo + 1; // 1 2 3 4
			hi = hi - 1; // 5 4 3 2

		}

		return true;

	}

	public static void palindromicSubstrings(String str) {

		ArrayList<String> list = substrings(str);

		for (String val : list) {

			if (palindrome(val))
				System.out.println(val);

		}

	}

	public static String reverseWords(String str) {

		String ans = "";

		while (true) {

			int idx = str.lastIndexOf(" ");

			String word = str.substring(idx + 1);
			ans = ans + word + " ";

			if (idx == -1)
				break;

			str = str.substring(0, idx);

		}

		return ans;

	}

	public static void appendString() {

		String str = "";
		int n = 100000;

		for (int i = 1; i <= n; i = i + 1) {
			str = str + i;
		}

	}

}





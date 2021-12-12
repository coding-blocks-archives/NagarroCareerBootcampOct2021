package L21_Dec12;

import java.util.Scanner;

public class SBOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(changeCase3(str));
	}

	public static String changeCase1(String str) {

		int diff = 'a' - 'A';

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i = i + 1) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				char nch = (char) (ch - diff);
				sb.setCharAt(i, nch);

			} else if (ch >= 'A' && ch <= 'Z') {

				char nch = (char) (ch + diff);
				sb.setCharAt(i, nch);

			}

		}

		return sb.toString();

	}

	public static String changeCase2(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i = i + 1) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				sb.setCharAt(i, Character.toUpperCase(ch));

			} else if (ch >= 'A' && ch <= 'Z') {

				sb.setCharAt(i, Character.toLowerCase(ch));

			}
		}

		return sb.toString();

	}
	
	public static String changeCase3(String str) {

		int diff = 'a' - 'A';

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i = i + 1) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				char nch = (char) (ch - diff);
				sb.append(nch);

			} else if (ch >= 'A' && ch <= 'Z') {

				char nch = (char) (ch + diff);
				sb.append(nch);

			}
			else {				
				sb.append(ch);
			}

		}

		return sb.toString();

	}

}

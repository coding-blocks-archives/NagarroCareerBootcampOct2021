package Assignments.Solutions;

import java.util.Scanner;

public class GenerateBinaryString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {

			String str = scn.next();
			binaryStrings(str, "");
			System.out.println();
			tc--;
			
		}
	}

	public static void binaryStrings(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		if (ch == '?') {
			binaryStrings(roq, ans + "0");
			binaryStrings(roq, ans + "1");
		} else {
			binaryStrings(roq, ans + ch);
		}

	}

}

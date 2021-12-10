package L19_Dec10;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printChars(str);

	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i = i + 1) {

			char ch = str.charAt(i);
			System.out.println(ch);
		}

	}

	public static ArrayList<String> substrings(String str) {

	}

	public static boolean palindrome(String str) {

	}

}



package L8_Nov13;

import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 1030;
		int in = 10;
		long lo = 10;

		// case 1
		by = (byte) sh;
		System.out.println(by);
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo ;

		in = by;
		in = sh;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// case 2
		by = 10;
		System.out.println(by);
		by = 127;
		System.out.println(by);
		by = (byte) 128;
		System.out.println(by);

		// case 3
		System.out.println(1000000000);
		System.out.println(10000000000l);

		// case 4
		float fl = 5.6f;
		double db = 7.8;

		// f = db ;
		db = fl;

		// case 5
		in = (int) fl;
		System.out.println(in);

		fl = in;
		System.out.println(fl);

		// case 6
		boolean bl = true;

		if (bl) {
			System.out.println("in if");
		} else {
			System.out.println("in else");
		}

		// case 7
		char ch = 'a';
		System.out.println(ch);

		// from code you can obtain the char value
		ch = 100;
		System.out.println(ch);

		// from char you can obtain the code
		int val = 'd';
		System.out.println(val);
		// or
		System.out.println((int) 'd');

		ch = 'x';

		// ch = in ;
		in = ch;
		System.out.println(in);

		char ch1 = 'a';
		char ch2 = 'd';

		// char + char upgrades itself to int
		char ch3 = (char) (ch1 + ch2);
		System.out.println(ch3);

		// char + int upgrades itself to int
		char ch4 = (char) (ch1 + 10);
		System.out.println(ch4);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 3);
		System.out.println(2 + " " + 3);
		System.out.println("Hello" + '\t' + "Bye");
		System.out.println("Hello" + "\t" + "Bye");

	}

}

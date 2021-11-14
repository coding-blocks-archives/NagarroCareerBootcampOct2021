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

	}

}

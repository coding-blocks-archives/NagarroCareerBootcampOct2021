package L19_Dec10;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		// create using literal
		String s = "hello"; // 2k
		String s1 = "hello"; // 2k

		System.out.println(s + " " + s1);

		s = "bye"; // 3k
		s1 = "bye"; // 3k

		System.out.println(s + " " + s1);

		s = "hello";

		// length obtain
		System.out.println(s.length());

		// charAt
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(s.length() - 1));

		// substring
		System.out.println(s.substring(1, 3));
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(2, 2).length());
		// System.out.println(s.substring(3,0));

		System.out.println(s.substring(0));

		// indexOf
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf("ell"));
		System.out.println(s.indexOf("ela"));

		System.out.println(s.lastIndexOf('l'));

		// startsWith
		System.out.println(s.startsWith("He"));
		System.out.println(s.startsWith("hello"));

		// endsWith
		System.out.println(s.endsWith("llo"));
		System.out.println(s.endsWith("ll"));

		// concat
		String s2 = "hii";
		String s3 = "bye";

		System.out.println(s2 + "," + s3 + " -> " + s2 + s3);
		String s4 = s2.concat(s3);
		System.out.println(s2 + "," + s3 + " -> " + s4);

		// new String
		String s5 = new String("hello");
		String s6 = new String("hello");

		s6 = new String("bye");
		s6 = s;

		System.out.println(s5 + " " + s6);

		// == and equals
		String s7 = "Hello";
		String s8 = s7;
		String s9 = "Hello";
		String s10 = new String("Hello");

		System.out.println((s7 == s8) + " , " + s7.equals(s8));
		System.out.println((s7 == s9) + " , " + s7.equals(s9));
		System.out.println((s7 == s10) + " , " + s7.equals(s10));
		
		// substring creates a new string
		String s11 = "hello" ;
		String s12 = "helloworld" ;
		
		String s13 = s12.substring(0,5) ;
		
		System.out.println(s11 + " " + s12 + " " + s13);
		
		// concat function creates a new string
		String s14 = "world" ;
		String s15 = s11.concat(s14) ;
		
		System.out.println(s11 + " " + s14 + " " + s15);
		
		// scanner input creates a new string
		Scanner scn = new Scanner(System.in) ;
		String str = scn.next() ;
		
		System.out.println(str);
		
		
	}

}













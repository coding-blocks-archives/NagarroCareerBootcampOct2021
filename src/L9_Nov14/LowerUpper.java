package L9_Nov14;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		char ch = scn.next().charAt(0) ;
		
		if(ch >= 'a' && ch <= 'z')
			System.out.println("lower");
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println("UPPER");
		else
			System.out.println("Spcl");
		

	}

}

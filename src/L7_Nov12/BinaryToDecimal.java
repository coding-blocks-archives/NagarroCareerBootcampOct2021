package L7_Nov12;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in) ;
		
		int n = scn.nextInt() ;
		int temp = n ;
		
		int mult = 1 ; // 2 ^ 0
		
		int ans = 0 ;
		
		while(n != 0) {
			
			int rem = n % 10 ;
			
			ans = ans + rem * mult ;
			
			mult = mult * 2 ;
			n = n / 10 ;
			
		}
		
		System.out.println("Decimal of " + temp + " is " + ans);

	}

}

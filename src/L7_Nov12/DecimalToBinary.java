package L7_Nov12;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in) ;
		
		int n = scn.nextInt() ;
		int temp = n ;
		
		int mult = 1 ; // 10 ^ 0
		
		int ans = 0 ;
		
		while(n != 0) {
			
			int rem = n % 2 ;
			
			ans = ans + rem * mult ;
			
			mult = mult * 10 ;
			n = n / 2 ;
			
		}
		
		System.out.println("Binary of " + temp + " is " + ans);

	}

}

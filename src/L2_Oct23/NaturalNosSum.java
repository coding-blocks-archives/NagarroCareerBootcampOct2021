package L2_Oct23;

import java.util.Scanner;

public class NaturalNosSum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in) ;
		
		System.out.println("Enter N ?");
		
		int sum = 0 ;
		
		int n = scn.nextInt() ;
		
		int count = 1 ;
		
		while(count <= n) {
			
			sum = sum + count ;
			count = count + 1 ;
		}
		
		System.out.println("Sum of first " + n + " natural nos is " + sum);
	
		scn.close();
	}
}












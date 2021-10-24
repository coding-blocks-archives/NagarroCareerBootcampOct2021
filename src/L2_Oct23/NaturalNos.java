package L2_Oct23;

import java.util.Scanner;

public class NaturalNos {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in) ;
		
		System.out.println("Enter N ?");
		
		int n = scn.nextInt() ;
		
		int count = 1 ;
		
		while(count <= n) {
			
			System.out.println(count);
			count = count + 1 ;
		}
		
	}
}

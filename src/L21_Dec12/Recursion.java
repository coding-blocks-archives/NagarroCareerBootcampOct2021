package L21_Dec12;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println("hello"); 	
		PD(6) ;
		System.out.println("bye");
	}
	
	// Bigger Problem
	public static void PD(int n) {
		
		// Base Case
		if(n == 0)
			return ;
		
		// Work
		System.out.println(n);
		
		// Smaller Problem
		PD(n-1) ; 
		
	}

}

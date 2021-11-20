package L10_Nov19;

public class ScopeDemo {

	public static void main(String[] args) {
		
		System.out.println("hii");
		System.out.println("bye");
		
		int a = 10 ;
		
		{			
			int b = 20 ;
			System.out.println(b);
		}
		
		System.out.println(a);
	}

}

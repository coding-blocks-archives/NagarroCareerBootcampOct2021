package L21_Dec12;

public class SBDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello") ;
		
		// length
		System.out.println(sb.length());
		
		// print
		System.out.println(sb);
		
		// charAt
		System.out.println(sb.charAt(2)) ;
		
		// add
		sb.insert(3, "hi") ;
		System.out.println(sb);
		// sb.append("bye") ;
		sb.insert(sb.length(), "bye") ;
		System.out.println(sb);
		
		// update
		sb.setCharAt(4, 'w');
		System.out.println(sb);
		
		// remove
		sb.deleteCharAt(4) ;
		System.out.println(sb);

		sb.delete(2, 5);
		System.out.println(sb);
		
		
	}
	
	public static String fun() {
		
		StringBuilder ans = new StringBuilder() ;
		
		// work, logic
		
		
		return ans.toString() ;
		
		
	}

}











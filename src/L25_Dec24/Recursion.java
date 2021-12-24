package L25_Dec24;

public class Recursion {

	public static void main(String[] args) {

		subsequencesAscii("ab", "");

	}

	// abc , _
	public static void subsequences(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0); // a
		String roq = ques.substring(1); // bc

		// No
		subsequences(roq, ans); // bc , _

		// Yes
		subsequences(roq, ans + ch); // bc , a

	}

	public static void subsequencesAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subsequencesAscii(roq, ans); // No
		subsequencesAscii(roq, ans + ch); // Yes
		subsequencesAscii(roq, ans + (int) ch); // Ascii

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}
	
	// "145" , _
	public static void KPC(String ques, String ans) {
		
		
		
		
		
	}

}

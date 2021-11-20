package L10_Nov19;

public class FunctionDemo {

	public static void main(String[] args) {

		System.out.println("hello");

		// Case 1 : Basic
		// fxn calling
		System.out.println("\n----- Case 1 -----");
		addition();
		subtraction();

		// Case 2 : Parameters
		System.out.println("\n----- Case 2 -----");
		int x = 100;
		int y = 200;
		additionParams(x, y);

		// Case 3 : Return
		System.out.println("\n----- Case 3 -----");
		int val = additionReturn(x, y);
		System.out.println(val);

		System.out.println("bye");

	}
	
	

	public static void fun() {

		System.out.println("hii i am in fun fucntion");
		System.out.println("i am enjoying discussion related to function");

		int x = 10;
		if (x > 5)
			return ;

		System.out.println("ok bye");
		System.out.println("gn");

	}

	public static int additionReturn(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public static void additionParams(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	// definition
	public static void addition() {

		int a = 10;
		int b = 20;

		int sum = a + b;

		subtraction();

		System.out.println("Sum is " + sum);
	}

	public static void subtraction() {

		int a = 100;
		int b = 40;

		int diff = a - b;

		System.out.println("Difference is " + diff);
	}

}

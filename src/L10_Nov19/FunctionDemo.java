package L10_Nov19;

public class FunctionDemo {

	static int num = 200;

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

		// Case 4 : Demo Example
		System.out.println("\n----- Case 4 -----");
		int one = 10;
		int two = 20;

		swap(one, two);
		System.out.println(one + " " + two);

		// Case 5 : global
		System.out.println("\n----- Case 5 -----");
		System.out.println(num); // global : 200
		int num = 100; // local
		System.out.println(num); // local variable wins
		System.out.println(FunctionDemo.num); // able to access global variable

		// Case 6
		System.out.println("\n----- Case 6 -----");
		num = 100;
		fun1(FunctionDemo.num + num);
		System.out.println(num);
		System.out.println(FunctionDemo.num);

	}

	public static void fun1(int no) {
		num = no;
	}

	public static void swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

	public static void fun() {

		System.out.println("hii i am in fun fucntion");
		System.out.println("i am enjoying discussion related to function");

		int x = 10;
		if (x > 5)
			return;

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

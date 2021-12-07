package L18_Dec5;

import java.util.ArrayList;

public class ArrayListOps {

	public static void main(String[] args) {

//		int[] one = { 10, 20, 30, 40, 40, 50, 50, 60, 60, 70, 70 };
//		int[] two = { 5, 10, 10, 30, 60, 70, 70, 70, 80 };

//		ArrayList<Integer> ans = intersection(one, two);
//		
//		for(int val : ans)
//			System.out.println(val);

//		System.out.println(intersection(one, two));

		int[] one = { 9, 9, 8, 7 };
		int[] two = { 6, 5 };

		System.out.println(addTwoArrays(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> res = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i = i + 1;
			} else if (one[i] > two[j]) {
				j = j + 1;
			} else {
				res.add(one[i]);
				i = i + 1;
				j = j + 1;
			}

		}

		return res;

	}

	public static ArrayList<Integer> addTwoArrays(int[] one, int[] two) {

		ArrayList<Integer> res = new ArrayList<>();
		
		int i = one.length - 1;
		int j = two.length - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0)
				sum = sum + one[i];

			if (j >= 0)
				sum = sum + two[j];

			int ld = sum % 10;
			res.add(0,ld) ;

			carry = sum / 10;

			i = i - 1;
			j = j - 1;
		}

		if (carry != 0)
			res.add(0,carry) ;
		
		return res ;

	}
}

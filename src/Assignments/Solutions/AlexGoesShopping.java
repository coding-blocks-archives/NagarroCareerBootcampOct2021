package Assignments.Solutions;

import java.util.*;

public class AlexGoesShopping {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++)
		{

			int am = sc.nextInt();
			int k = sc.nextInt();

			int count = 0;
			for (int j = 0; j < n; j++)
			{
				if ((am % a[j]) == 0)
					count++;
			}

			if (count >= k)
				System.out.println("Yes");

			else
				System.out.println("No");

		}

	}

}
package Assignments.Dec15;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int testcases = scn.nextInt();

		for (int ptc = 1; ptc <= testcases; ptc = ptc + 1) {

			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int tr = scn.nextInt();
			int tc = scn.nextInt();

			int[] rf = new int[tr];
			for (int i = 0; i < rf.length; i++) {
				rf[i] = scn.nextInt();
			}

			int[] cf = new int[tc];
			for (int i = 0; i < cf.length; i++) {
				cf[i] = scn.nextInt();
			}

			int rc123 = minCostc1c2c3(rf, c1, c2, c3);
			int cc123 = minCostc1c2c3(cf, c1, c2, c3);

			int minCost = Math.min(rc123 + cc123, c4);
			System.out.println(minCost);
		}

	}

	public static int minCostc1c2c3(int[] freq, int c1, int c2, int c3) {

		int cost = 0;

		for (int i = 0; i < freq.length; i++) {
			cost = cost + Math.min(freq[i] * c1, c2);
		}

		return Math.min(cost, c3);

	}

}

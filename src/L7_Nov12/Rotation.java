package L7_Nov12;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int rot = scn.nextInt();

		// no. of digits in n
		int temp = n;
		int nod = 0;

		while (temp != 0) {
			temp = temp / 10;
			nod = nod + 1;
		}

		// rotations
		rot = rot % nod ;
		
		// -ve to +ve rotations
		if(rot < 0)
			rot = rot + nod ;
			
		// rot rotations
		for (int r = 1; r <= rot; r = r + 1) {
			
			// single rotation
			int ld = n % 10;
			int ron = n / 10;

			int power = (int) Math.pow(10, nod - 1);

			int rn = ld * power + ron;
			n = rn ;			
		}
		
		System.out.println(n);
	}

}

package fundamentals.part1;

import java.text.DecimalFormat;

/* This illustrates printing out simple arithmetic operations
 *  with print and printf.
 *  Note that to format the number of decimals, we need to import DecimalFormat.
 */

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		Double b2 = Double.valueOf(b);
		
		System.out.printf("The sum of 1 and 2 is: %d", a + b);
		System.out.printf("\n");
		System.out.printf("The integer division of 1 by 2 is: %d\n", a/b);
		System.out.printf("real division is %f\n", a/b2);
		
		Double c = a/b2;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Using DecimalFormat: " + df.format(c));
	}

}

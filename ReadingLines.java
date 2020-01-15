// package fundamentals.part1;

import java.io.IOException;

public class ReadingLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the first number:");
		int var1 = Integer.parseInt(System.console().readLine());

		System.out.println("Enter the second number:");
		int var2 = Integer.parseInt(System.console().readLine());

		System.out.printf("The product of the two numbers is %d %n", (var1 * var2));

	}

}

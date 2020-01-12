package fundamentals.part1;

import java.io.IOException;

public class GettingConsoleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your first Byte");
		
		int inByte = System.in.read();
		System.out.println("The first byte that you typed: " + (char) inByte);
		System.out.printf("%s: %c.%n", "The first byte that you typed", inByte);

	}

}

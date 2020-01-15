package fundamentals.part1;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int var1 = sc.nextInt();
		
		System.out.println("Enter next number");
		int var2 = sc.nextInt();
		
		System.out.printf("The sum of these numbers is: %d", var1 + var2);
		
		sc.close();

	}

}

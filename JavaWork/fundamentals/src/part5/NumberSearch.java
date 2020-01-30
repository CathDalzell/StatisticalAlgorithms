package part5;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {2, 4, 7, 98, 32, 77, 81, 62, 45, 71}; // define by enumeration
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to find: ");
		int ele = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if (sample[i] == ele) {
				System.out.println("The match was found at " + i);
				break;
			} 
			if (i >= sample.length - 1)System.out.println("Not found in sample.");
			
		}
		
			
		
		
		sc.close();

	}

}

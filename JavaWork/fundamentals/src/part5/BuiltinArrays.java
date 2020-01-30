package part5;

import java.util.Arrays;

public class BuiltinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float[] myArray = {14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 51};
	Arrays.sort(myArray);
	System.out.println(Arrays.toString (myArray)); // note that I can't chain the sort and the print commands as I would in Scala.
	
	}

}

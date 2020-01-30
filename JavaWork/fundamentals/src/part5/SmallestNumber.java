package part5;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	float[] myArray = {14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 51};
	
	float minX = myArray[0];
	
	for (int i = 0; i < myArray.length; i++) {
		if (myArray[i] < minX) {
			minX = myArray[i];
		}
	}
	
	System.out.printf("The smallest value is %.1f", minX);
	}
	
	

}

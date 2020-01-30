package part5;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[10]; // create empty array with 10 elements
		System.out.printf("The length of the uninitialized array is %d\n", myArray.length);
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		} // the array is initialized with all zeros. The length is set to 10.
		
		System.out.println(); // new line

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}
		
/*		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
*/		
		for (int i : myArray) {
			System.out.println(i);
		} // use the foreach syntax.
	}

}

package part5;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] dbl = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dbl[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Example of a two-dimensional array");
	}

}

package assistedprojectsPhase1;

public class Array10 {

	public static void main(String[] args) {
		//single-dimensional array
		int a[]= {100,120,230,040,150};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8,10}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);

	}

}

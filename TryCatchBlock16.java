package assistedprojectsPhase1;

public class TryCatchBlock16 {

	public static void main(String[] args) {
		 int[] array = new int[7];
	        try 
	        {
	            array[9] = 7;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	    }
	}



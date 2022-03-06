package assistedprojectsPhase1;

public class CustomException17 {

	public static void main(String[] args) {
		 int a=15,b=0,rs;

	        try
	        {
	            if(b==0)        
	                throw(new ArithmeticException(" we can't divisible by Zero."));
	            else
	            {
	                rs = a / b;
	                System.out.print("\n\tThe result is : " + rs);
	            }
	        }
	        catch(ArithmeticException Ex)
	        {
	            System.out.print("\n\tError : " + Ex.getMessage());
	        }

	        System.out.print("\n\t Finally program ends....");
	    }
	  }
	



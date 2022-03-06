package assistedprojectsPhase1;
interface First 
{  
    default void show() 
    { 
        System.out.println(" First Default:)"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println(" Second Default:)"); 
    } 
}  
public class DiamondOOPS21 implements First, Second  {
	 public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DiamondOOPS21 ob = new DiamondOOPS21(); 
	        ob.show(); 
	    } 
	}


